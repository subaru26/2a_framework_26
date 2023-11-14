/**
 * 
 */
// script.js

$(document).ready(function () {
    // 商品データ（仮のデータ）
    const productsData = [
        { id: 1, image: 'product1.jpg', name: '商品1', price: 1000 },
        { id: 2, image: 'product2.jpg', name: '商品2', price: 1500 },
        // 他の商品データを追加
    ];

    // 商品一覧を表示
    const productsContainer = $('#products-container');

    productsData.forEach(product => {
        const productElement = createProductElement(product);
        productsContainer.append(productElement);
    });
});

function createProductElement(product) {
    const productElement = $('<div>').addClass('product');
    const imageElement = $('<img>').attr('src', 'images/' + product.image).attr('alt', product.name);
    const nameElement = $('<p>').text(product.name);
    const priceElement = $('<p>').text('¥' + product.price);

    productElement.append(imageElement, nameElement, priceElement);
    return productElement;
}
