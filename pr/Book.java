public class Book implements Comparable 
{
	private String name;
	private String title;
	private String year;
	private String id;
	private String publisher;
	private String llc;
	private String stock;
	private Integer need;
	public Book(String name, String title, String year, String id, String publisher, String llc, String stock, Integer need)
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
	public String getYear()
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
	public String getStock()
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
	public void setYear(String year)
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
	public void setStock(String stock)
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
		else if(need == 7)	
			return stock.compareTo(s.getStock());
	
		else if(need == -1)
			return s.getName().compareTo(name);
		else if(need == -2)
			return s.getTitle().compareTo(title);
		else if(need == -3)			
			return s.getYear().compareTo(year);
		else if(need == -4)
			return s.getId().compareTo(id);
		else if(need == -5)
			return s.getPublisher().compareTo(publisher);
		else if(need == -6)
			return s.getLlc().compareTo(llc);
		else	
			return s.getStock().compareTo(stock);




	}

	@Override
	public String toString()
	{
		String res = "";
		res += this.name + "~" + this.title + "~" + this.year + "~" + this.id + "~ " + this.publisher + "~" + this.llc + "~" + this.stock + "~";
		//System.out.println(res);
		return res;
	}


}