package com.example.shoplistst.domain

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopItem(shopItemId:Int):ShopItem{
       return shopListRepository.getShopItem(shopItemId)
    }

}