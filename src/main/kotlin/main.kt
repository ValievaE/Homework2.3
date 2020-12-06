fun main() {

    val prevPayment = 10000
    val payment = 1200
    val standartSale = 100
    val advancedSale = payment * 0.05
    val meloman = false

    if (prevPayment <= 1000) {
        println("Payment: $payment rub.")
    } else if (prevPayment in 1001..10000) {
        if (meloman) {
            val resultPaymentStandard = (payment - standartSale) - (payment - standartSale) * 0.01
            println("Payment: $resultPaymentStandard rub.")
        } else {
            val resultPaymentStandard = payment - standartSale
            println("Payment: $resultPaymentStandard rub.")
        }

    } else if (prevPayment > 10000) {
        if (meloman) {
            val resultPaymentAdv = (payment - advancedSale) - (payment - advancedSale) * 0.01
            println("Payment: $resultPaymentAdv rub.")
        } else {
            val resultPaymentAdv = payment - advancedSale
            println("Payment: $resultPaymentAdv rub.")
        }


    }


}