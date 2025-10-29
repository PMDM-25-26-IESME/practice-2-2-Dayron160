package com.dayron.vat_calculator_app.ui.viewmodels

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import java.text.NumberFormat

class VatViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(VatState())
    val uiState: StateFlow<VatState> = _uiState.asStateFlow()

    fun updateProductInput(newProduct: String) {
        _uiState.update { currentState ->
            currentState.copy(productInput = newProduct)
        }
    }

    fun updateAmountInput(newAmount: String) {
        _uiState.update { currentState ->
            currentState.copy(amountInput = newAmount)
        }
        calculateVat()
    }

    fun updateVatInput(newVatPercent: String) {
        _uiState.update { currentState ->
            currentState.copy(percentInput = newVatPercent)
        }
        calculateVat()
    }


    private fun calculateVat(){
        val amount = _uiState.value.amountInput.toDoubleOrNull() ?: 0.0
        val vatPercent  = _uiState.value.percentInput.toDoubleOrNull() ?: 0.0

        val vat = vatPercent / 100 * amount + amount
        val formattedVat = NumberFormat.getCurrencyInstance().format(vat)

        _uiState.update { currentState ->
            currentState.copy(vat = formattedVat)
        }
    }
}