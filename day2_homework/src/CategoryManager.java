import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    List<Category> categories=new ArrayList<Category>();
	
	public void add(Category category) {
		categories.add(category);
		System.out.println(category.name+" eklendi");
	}
	
	public void update(int categoryId){
		//update
	}
	
   public void delete(int categoryId){
		categories.remove(categoryId);
	}

   public Category getById(int categoryId){
   return categories.get(categoryId);
}

   public Category[] getAll() {
   return null;
    }
}
