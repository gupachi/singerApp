import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "singer_table")
data class SingerEntity(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val name: String,
    val example: String
)
