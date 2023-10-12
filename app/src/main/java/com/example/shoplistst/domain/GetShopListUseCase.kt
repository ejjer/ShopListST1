package com.example.shoplistst.domain

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopList():List<ShopItem>{
        return shopListRepository.getShopList()
    }
}