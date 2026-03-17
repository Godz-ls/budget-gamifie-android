object Constants {
    val CATEGORIES = listOf(
        Category("Alimentation", "#FF5722", "icon_alimentation"),
        Category("Transport", "#2196F3", "icon_transport"),
        Category("Logement", "#4CAF50", "icon_logement"),
        Category("Loisirs", "#FFC107", "icon_loisirs"),
        Category("Autres", "#9E9E9E", "icon_autres")
    )

    data class Category(val name: String, val color: String, val icon: String)
}