package com.example.task21

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.task21.databinding.ActivityTableBinding

class Table : Activity() {

    private lateinit var binding: ActivityTableBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTableBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun onClick(v: View) {
        v as Button
        var my_intent = Intent(this, OpenProduct::class.java)
        my_intent.putExtra("name", v.text.toString())
        when (v.text.toString()) {
            "Борщ" -> {
                my_intent.putExtra("image_id", R.drawable.borsch_big)
                my_intent.putExtra("icon_id", R.drawable.borsch)
                my_intent.putExtra(
                    "description", """Говядина на косточке - 500г.
Капуста- 400г
3-4 картофелины
1 морковь
1 больша луковица
3-4 зуба чеснока
2 вкусных сладких свеклы. Можно предварительно попробовать. Безвкусная свекла будет просто бесполезна
2-3 ст.л. томатной пасты. Можно использовать и нормальные, свежие помидоры или помидоры в собственном соку. Я пользуюсь обычно именно ими.
2.ч.л соли."""
                )
            }
            "Салат \"Цезарь\"" -> {
                my_intent.putExtra("image_id", R.drawable.cesar)
                my_intent.putExtra("icon_id", R.drawable.caesar)
                my_intent.putExtra("description", """Грудка куриная - 1 шт. (400 г)
Капуста пекинская - 1 шт.
Помидоры черри - 150-200 г
Сыр твердый (желательно пармезан) - 50-70 г
Хлеб белый - 3-4 ломтика
Соль - по вкусу
Масло оливковое - 6 ст.л. (для жарки)
Перец черный молотый - 1 ч.л.
Чеснок - 4 зубчика
Майонез - 3-4 ст.л.""")
            }
            "Блинчики" -> {
                my_intent.putExtra("image_id", R.drawable.blinchik)
                my_intent.putExtra("icon_id", R.drawable.pancake)
                my_intent.putExtra("description", """Яйцо – 1 шт.
Мука – 150 г.
Молоко –150 мл.
Подсолнечное масло – 15 мл.
Соль (по вкусу) – 20 г.
Сахар (по вкусу) – 20 г.""")
            }
            "Мол. коктейль" -> {
                my_intent.putExtra("image_id", R.drawable.milkshake_big)
                my_intent.putExtra("icon_id", R.drawable.milkshake)
                my_intent.putExtra("description", """Банан 2
Молоко или кокосовое молоко 350 мл.
Какао 2 ст. ложки
Мед 1 ст. ложка
Кокосовая стружка для присыпки""")
            }
            "Спагетти" -> {
                my_intent.putExtra("image_id", R.drawable.spagetti)
                my_intent.putExtra("icon_id", R.drawable.spaghetti)
                my_intent.putExtra("description", """Спагетти (или другие макаронные изделия) - 250 г
Куриные бедра - 2 шт.
Помидоры измельченные или томатный сок - 200 мл
Чеснок - 1 зубчик
Лук репчатый - 1 шт.
Сыр твёрдый - 30 г
Масло растительное - 2-3 ст. ложки
Сахар (по желанию) - 1 ч. ложка
Соль - по вкусу
Перец свежемолотый - по вкусу
Базилик сушеный - по вкусу
Специи (на выбор) - по вкусу
Зелень свежая (для подачи) - 1 веточка""")
            }
            else -> return
        }
        startActivity(my_intent)
    }
}