package com.myself223.bekxatdz.Presenter

import com.myself223.bekxatdz.Data.CounterModel
import com.myself223.bekxatdz.MainActivity
import com.myself223.govnodlyaneadekvatov.Presenter.PresenterContracts

class CounterPresenter(private val model: CounterModel)
    : PresenterContracts.counterPresenter {
    private lateinit var counterView: PresenterContracts.counterView
    override fun changeColor() {
        if (model.count== 10){
            counterView.color()
        }
    }

    override fun underChangeColor() {
        if (model.count  > 10){
            counterView.underColor()
        }
        if (model.count  < 10){
            counterView.underColor()
        }
    }

    override fun toast() {
        if (model.count == 5){
            counterView.stopper()

        }
    }


    override fun increments() {
        model.increment()
        counterView.updateCounter(model.count)

    }

    override fun decrement() {
        model.decrement()
        counterView.updateCounter(model.count)
    }

    override fun attachView(view: MainActivity) {
        this.counterView = view

    }

}