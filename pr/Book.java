public class Book implements Comparable 
{
	private String name;
	private String title;
	private Integer year;
	private String id;
	private String publisher;
	private String llc;
	private Integer stock;
	private Integer need;
	public Book(String name, String title, Integer year, String id, String publisher, String llc, Integer stock, Integer need)
	{
		this.name = name;
		this.title = title;
		this.year = year;
		this.id = id;
		this.publisher = publisher;
		this.llc = llc;
		this.stock = stock;
		this.need = need;
	}
	public String getId()
	{
		return this.id;
	}
	public String getName()
	{
		return this.name;
	}
	public String getTitle()
	{
		return this.title;
	}
	public int getYear()
	{
		return this.year;
	}
	public String getPublisher()
	{
		return this.publisher;
	}
	public String getLlc()
	{
		return this.llc;
	}
	public int getStock()
	{
		return this.stock;
	}

	public void setId(String id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public void setYear()
	{
		this.year = year;
	}
	public void setPublisher(String publisher)
	{
		this.publisher = publisher;
	}
	public void setLlc(String llc)
	{
		this.llc = llc;
	}
	public void setStock(Integer stock)
	{
		this.stock = stock;
	}
	


	public int compareTo(Object student)
	{
		Book s = (Book) student;
		if(need == 1)
			return name.compareTo(s.getName());
		else if(need == 2)
			return title.compareTo(s.getTitle());
		else if(need == 3)			
			return year.compareTo(s.getYear());
		else if(need == 4)
			return id.compareTo(s.getId());
		else if(need == 5)
			return publisher.compareTo(s.getPublisher());
		else if(need == 6)
			return llc.compareTo(s.getLlc());
		else	
			return stock.compareTo(s.getStock());
	}

	public String toString()
	{
		String res = "";
		res += this.name + "; " + this.title + "; " + this.year + "; " + this.id + ";  " + this.publisher + "; " + this.llc + "; " + this.stock + "\n";
		return res;
	}


}