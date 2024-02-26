package com.myself223.bekxatdz.Data

import com.myself223.bekxatdz.Presenter.CounterPresenter

class Injector {

    companion object {
        fun getPresenter(): CounterPresenter {
            return CounterPresenter(CounterModel())
        }
    }
}