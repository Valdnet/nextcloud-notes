package it.niedermann.owncloud.notes.persistence.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import it.niedermann.owncloud.notes.persistence.entity.SingleNoteWidgetData;

@Dao
public interface WidgetSingleNoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void createOrUpdateSingleNoteWidgetData(SingleNoteWidgetData data);

    @Query("DELETE FROM SINGLENOTEWIDGETDATA WHERE id = :id")
    void removeSingleNoteWidget(int id);

    @Query("SELECT * FROM SINGLENOTEWIDGETDATA WHERE id = :id")
    SingleNoteWidgetData getSingleNoteWidgetData(int id);
}
