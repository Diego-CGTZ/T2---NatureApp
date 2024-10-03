package com.example.natureapp.models

data class Place(
    val name: String,
    val description: String,
    val imageUrl: String
)

val places = listOf(
    Place(
        name = "Montañas Rocosas",
        description = "Una cordillera impresionante que se extiende a lo largo de América del Norte.",
        imageUrl = "https://cdn.aarp.net/content/dam/aarpe/es/home/turismo/nacional/info-2020/guia-parque-montanas-rocosas-rocky-mountain/_jcr_content/root/container_main/container_body_main/container_image/articlecontentfragme/cfimage.coreimg.75.1440.jpeg/content/dam/aarp/travel/Domestic/2020/07/1140-rocky-mountain-national-park-esp.jpg"
    ),
    Place(
        name = "Gran Barrera de Coral",
        description = "El sistema de arrecifes más grande del mundo, ubicado en Australia.",
        imageUrl = "https://fotografias-compromiso.atresmedia.com/clipping/cmsimages02/2016/05/11/FD4F2F84-4F93-4817-91D3-CFF643425E1A/58.jpg"
    ),
    Place(
        name = "Desierto del Sahara",
        description = "El desierto más grande del mundo, conocido por sus vastas dunas de arena.",
        imageUrl = "https://www.ecuavisa.com/binrepository/1200x600/0c0/1200d600/none/11705/QOIB/62d568a914174_1764878_20240924064714.jpg"
    ),
    Place(
        name = "Islandia auroras boreales",
        description = "Islandia es uno de los pocos países donde se pueden ver las auroras boreales durante una gran parte del año.",
        imageUrl = "https://www.visitfinland.com/.imaging/mte/visit-finland-theme/xlUpW/dam/vf/Northern-Lights/Northern-Lights_mirror-aurora_autumn---Markus-Kiili_optimized.jpg/jcr:content/Northern%20Lights_mirror%20aurora_autumn%20-%20Markus%20Kiili_optimized.jpg"
    ),
    Place(
        name = "Isla la palma",
        description = "La Palma, conocida como la \"Isla Bonita\", es una de las Islas Canarias, situada en el Océano Atlántico.",
        imageUrl = "https://static.eldiario.es/clip/82cbe532-7e7f-4e09-8412-4ae5e2b3d27e_16-9-discover-aspect-ratio_default_0.webp"
    )
)