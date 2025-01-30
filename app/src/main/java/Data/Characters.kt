package Data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Characters(
    @ColumnInfo(name = "character_name")
    var name: String,
    @ColumnInfo(name = "character_photo")
    var photo: String
){
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}
