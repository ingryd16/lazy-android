package br.senai.sp.jandira.lazyproducts.dao.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.lazyproducts.R
import br.senai.sp.jandira.lazyproducts.model.Product

class ProductRepository {

    companion object{



        @Composable
        fun getProductslist(): List<Product>{
            return listOf<Product>(
                Product(
                    id = 1,
                    name = "Mouse Gamer",
                    description =  "O camundongo mais amado dos desenhos animados",
                    price = 148.99,
                    image = painterResource(id = R.drawable.img)


                ),
                Product(
                    id = 2,
                    name = "Teclado",
                    description = "teclado gamer, extremamente bonito e funcional",
                    image = painterResource(id = R.drawable.img)

                ),
                Product(id = 3, name = "Monitor", price = 897.99),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
            )

        }
    }

}