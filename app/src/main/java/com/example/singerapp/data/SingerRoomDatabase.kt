import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import android.content.Context


@Database(entities = [SingerEntity::class], version = 1, exportSchema = false)
abstract class SingerDatabase : RoomDatabase() {

    abstract fun exampleDao(): SingerItemDao

    companion object {
        @Volatile
        private var INSTANCE: SingerDatabase ? = null

        fun getDatabase(context: Context): SingerDatabase  {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    SingerDatabase ::class.java,
                    "singer_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
