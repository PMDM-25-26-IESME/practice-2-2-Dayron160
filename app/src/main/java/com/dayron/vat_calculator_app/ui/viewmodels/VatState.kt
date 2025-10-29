package com.dayron.vat_calculator_app.ui.viewmodels

data class VatState (
    val productInput: String = "",
    val amountInput: String = "",
    val percentInput: String = "15",
    val vat: String = ""
)