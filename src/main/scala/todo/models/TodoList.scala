package todo.models

import com.mongodb.casbah.Imports._
import net.liftweb.mongodb.record.{MongoMetaRecord, MongoRecord}
import net.liftweb.mongodb.record.field.StringPk
import net.liftweb.record.field.StringField
/**
  * Created by ratapong on 4/7/2560.
  */
protected class TodoList private() extends MongoRecord[TodoList] with StringPk[TodoList] {

  override def meta: MongoMetaRecord[TodoList] = TodoList

  object id extends StringField(this, 128) {
    override def name: String = "id"
  }

  object taskName extends StringField(this, 128) {
    override def name: String = "task_name"
  }

  object description extends StringField(this, 128) {
    override def name: String = "description"
  }

  object completed extends StringField(this, 128) {
    override def name: String = "completed"
  }
}

protected object TodoList extends TodoList with MongoMetaRecord[TodoList] {
  override def collectionName: String = "TodoList"
}