# Экзамен. Коллекции. Стажер. Java.
## Контрольные вопросы - Коллекции

###1.Что такое "коллекция". ###

**Java Collection Framework** – это иерархия интерфейсов и реализаций, которая является частью JDK и позволяет программистам пользоваться большим количеством структур для хранения набора данных. На вершине иерархии Java Collection Framework находятся 2 интерфейса:
1. Collection
2. Map
   Эти интерфейсы разделяют все коллекции, входящие во в фреймворк на 2 части по типу хранения данных:
- простые последовательные наборы элементов;
- наборы пар «ключ-значение».

Коллекции работают с дженериками. Например, в марках содержатся марки, в значках значки. В марки мы не можем добавлять значки и тд.
Если интерфейс Collection, а есть класс CollectionS. Их нельзя путать.

###2.Перечислите основные методы из интерфейса java.util.Collection. ###

**Интерфейс Collection** — это то место, откуда берут начало все коллекции. Collection — это идея, это представление о том, как должны себя вести все коллекции. Интерфейс Collection является фундаментальным интерфейсом для классов Java, поддерживающих наборы данных (коллекции), в котором объявлены следующие 2 основных метода :
public interface Collection<E>
```
{
boolean add (E element();
Iterator <E> iterator();
}
```
Помимо них, интерфейс Collection имеет еще несколько методов.
Метод add() добавляет элемент к набору и возвращает либо значение true, если набор данных изменился, либо false в противном случае. Например, если попытаться добавить в множество уже существующий объект, то запрос add() будет проигнорирован, поскольку по определению множество не может содержать дублирующие объекты.
Метод iterator() возвращает объект-итератор, реализующий интерфейс Iterator, который используется для последовательного обращения к элементам набора данных.
```
add(E e)
addAll(Collection<? extends E> c)
clear()
contains(Object o)
containsAll(Collection<?> c)
equals(Object o)
hashCode()
isEmpty()
iterator()
parallelStream()
remove(Object o)
removeAll(Collection<?> c)
removeIf(Predicate<? super E> filter)
retainAll(Collection<?> c)
size()
spliterator()
stream()
toArray()
toArray(T[] a)
```

###3.Назовите преимущества использования коллекций. ###

Для хранения набора данных в Java предназначены массивы (Arrays). Однако массивы не всегда удобно использовать в первую очередь потому, что массивы имеют фиксированный размер. Если мы хотим массив больше — нам нужно создать новый экземпляр. Кроме того, поиск элемента — тоже сложная вещь для массива. Есть метод Arrays.binarySearch, но данный поиск работает только на сортированном массиве (для несортированного массива результат не определён или попросту непредсказуем). То есть поиск нас будет обязывать каждый раз сортировать. Удаление — тоже лишь очищает значение. Поэтому мы ещё и не знаем, сколько в массиве реально данных, знаем только сколько ячеек в массиве.

Эти проблемы в Java решают коллекции. Так же классы коллекций реализуют различные алгоритмы и структуры данных. Поэтому мы имеем хорошо оптимизированные структуры данных, которые описывают легкие способы работы с данными и при правильном выборе коллекции мы можем ускорить работу нашего приложения.
+ отсутствует необходимость следить за размерами коллекции (в отличии от массива);
+ позволяют сократить количество кода и требуют меньше усилий для реализации, т.к. в коллекциях реализовано много методов по добавлению, удалению, сортировке элементов и т.п.;
+ если правильно подобрать коллекцию, то можно увеличить производительность программы;
+ упрощают взаимодействие разных частей программы, т.к. являются универсальным способом хранения и передачи данных.

###4.Какие данные могут хранить коллекции? ###

Коллекции могут хранить любые ссылочные типы данных (Byte , Short,  Integer,  Long, Character, Float, Double,  Boolean, String
У всех ссылочных null по умолчанию.
У не ссылочных: (Byte (0), Short(0),  Integer(0),  Long(0L), Character(\u0000), Float(0.0f), Double(0.0d),  Boolean(false), String(null)

###5.Какие есть типы коллекций? Как они характеризуются? ###

Есть много разных задач, для разных задач подходят разные типы коллекций.

**Set (перевод: множество)** - множество неповторяющихся элементов (Здесь могут храниться только уникальные значения, нет дубликатов). Очень быстрый.

В основе любого Set лежит урезанная версия Map. Map хранил пары: ключ:значение. Set же пользуется внутри себя Map’ом. Для set пары не нужны, это значения. В основе HashSet находится объект HashMap, который и хранит в качестве ключей значения HashSet.

**Queue (Deque)** - очередь (FIFO первый вошел, первый вышел). реализует LinkedList

**List** - упорядоченный список (В какой последовательности данные положили, в такой они и хранятся. Допускаются дубликаты.)

**Map** - карта, ассоциативный массив (Значения хранятся в виде пар ключ=значение. Каждому элементу из множества ключей соответствует множество значений. Ключи уникальные. По ключу получаем значение. У мапы нет итератора. Map не наследуется от Collection.)

**Классы карт отображений (Map):**

- AbstractMap<K, V> - реализует интерфейс Map<K, V>;
- HashMap<K, V> - расширяет AbstractMap<K, V>, используя хэш-таблицу, в которой ключи отсортированы относительно значений их хэш-кодов;

Работает по принципу хэширования (преобразование через hashCode любого объекта в число int).
В основе HashMap лежит массив. Элементами данного массива являются структуры LinkedList. Данные структуры LinkedList и заполняются элементами, которые мы добавляем в HashMap.
HashMap не запоминает порядок добавления элементов, его методы работают очень быстро. Когда нет необходимости хранить пары ключ-значение в отсортированном виде и когда нам нужно очень быстро получать элементы из коллекции, hashmap отличный выбор.
Ключи элементов должны быть уникальными. Ключ может быть null. Значения элементов могут повторяться. Значения могут быть null.
Put – положить в массив; PutIfAbsent – добавить элемент, если такого элемента нет; get() – вывести на экран по ключу; remove() – удалить; containsValue – true есть ли такое значение в hashMap; containsKey – true есть ли такое ключ в hashMap; keyset – возвращает множество всех ключей, которые есть в нашей коллекции;  values – возвращает множество всех значений, которые есть в нашей коллекции;

**При создании HashMap мы можем задать 2 параметра, которые сильно влияют на производительность:**
- Initial capacity – начальный размер массива;
  Чем он больше, тем больше места будет заниматься массив, но тем меньше LinkedListЫ будут образовываться внутри конкретной позиции массива и поиск будет происходить быстрее. Можем пожертвовать памятью, но будет выше скорость. (16 – золотая середина и значение по умолчанию)
- Load factor – коэффициент того, насколько массив должен быть заполнен, после чего его размер будет увеличен вдвое.
  Чем больше, тем больше будем экономить памяти, но поиск будет происходить дольше (0,75 – золотая середина)
  **
Что такое  capacity?**

Capacity - размер массива, количество бакетов. Initial capacity - начальный размер массива при создании объекта HashMap. Задается в конструкторе.
**
Что такое load_factor?**

Предельно допустимое отношение заполненных бакетов к общему количеству бакетов, после превышения которого начинается рехешинг. Значение по умолчанию - 0.75. То есть, допустим у Вас массив на 128 ячеек и из них занято 96. load_factor здесь 96/128=0.75. Если при добавлении записи будет занят еще один бакет, запустится процесс рехешинга, будет создан массив большего объема (обычно в 2 раза) и значении load_factor снизится.

После достижения определенного порога, вместо связанных списков используются сбалансированные деревья. Значит по началу HashMap сохраняет объекты в LinkedList, а при пороге в Tree т.к скорость падает.
Роль equals и hashCode в HashMaphashCode позволяет определить корзину для поиска элемента, а equals используется для сравнения ключей элементов в списке внутри корзины и искомого ключа.

- TreeMap<K, V> - расширяет AbstractMap<K, V> используя дерево, где ключи расположены в виде дерева поиска в строгом порядке по возрастанию;

Элементами TreeMap являются пары ключ/значение. В TreeMap элементы хранятся в отсортированном по возрастанию порядке. В основе TreeMap лежит красно-черное дерево. Это позволяет методам работать быстро, но не быстрее, чем методы HashMap.

- WeakHashMap<K, V> - позволяет механизму сборки мусора удалять из карты значения по ключу, ссылка на который вышла из области видимости приложения.
- LinkedHashMap<K, V> - запоминает порядок добавления объектов в карту и образует при этом дважды связанный список ключей.

LinkedHashMap является наследником HashMap. Хранит информацию о порядке добавления элементов или порядке их использования, чего не делает HashMap. Производительность из-за этого методов немного меньше HashMap. Используем какой-то элемент (.get) он становится последним в мапе.

###6. Назовите основные реализации List, Set, Map. ###

Коротко:
•	List: ArrayList, LinkedList
•	Set: HashSet, LinkedHashSat, TreeSet
•	Map: HashMap, LinkedHashMap, TreeMap

Подробно:

**List** — упорядоченный список, в котором у каждого элемента есть индекс. Дубликаты значений допускаются. Null допускается
Например, последовательность букв в слове: буквы могут повторяться, при этом их порядок важен.
```
List: ArrayList, LinkedList
```
**Set** — это неупорядоченное множество уникальных элементов.
Например, мешочек с бочонками для игры в лото: каждый номер от 1 до 90 встречается в нём ровно один раз, и заранее неизвестно, в каком порядке бочонки вынут при игре.
```
Set: HashSet, LinkedHashSet, TreeSet
```
**Map** состоит из пар «ключ-значение». Ключи уникальны, а значения могут повторяться. Порядок элементов не гарантирован. Map позволяет искать объекты (значения) по ключу.
Пример: стопка карточек с иностранными словами и их значениями. Для каждого слова (ключ) на обороте карточки есть вариант перевода (значение), а вытаскивать карточки можно в любом порядке

**Методы интерфейса Map**

В интерфейсе Map<K, V> определены методы, которые работают на всех картах.
- V put(K key, V value) – запись;
- V get(Object key) – получение значение;
- V remove(Object key) – удаление ключа;
- Boolean containsKey(Object key) – наличие ключа;
- Boolean containsValue(Object value) – наличие значения;
- int size() – размер отображения;
- Boolean isEmpty() – проверка на пустоту;
- void putAll(Map <? Extends K, ? extends V> m) – добавление всех пар;
- void clear() – полная очистка;
- public Set<K> keyset() – множество ключей;
- public Collection<V> values() – коллекция значения;
- public Set<Map.Entry<K, V>> entrySet() – множество пар;
```
Map: HashMap, LinkedHashMap, TreeMap
```
LinkedHashMap является наследником HashMap. Хранит информацию о порядке добавления элементов или порядке их использования. Производительность методом немного ниже, чем у методов HashMap.

###7.В чём отличие ArrayList от LinkedList? ###

Строение ArrayList кардинально отличается по строению от LinkedList . Использование (базовые методы) по добавлению, удалению одинаковые т.к. они оба от интерфейса List.

**ArrayList** это список, реализованный на основе массива, а **LinkedList** — это классический связный список, основанный на объектах с ссылками между ними.

Если хотим работать с коллекцией в которой постоянно будем вызывать какой-то элемент, производить поиск элемента, работать с методом get тогда лучше использовать ArrayList, т.к. поиск элементов моментален, он в своей основе использует массив. С другой стороны, если в коллекции поиск не часто используется, а часто добавляем/удаляем элементы, тогда желательнее использовать LinkedList.

ArrayList - основан на динамическом массиве, хранит свои элементы в массиве. (используют, если элементы чаще читаются, чем добавляются). Самая используемая коллекция. Используется, когда нам нужна структура похожая на массив, но мы хотели бы добавлять, удалять, изменять элементы и т.д. В основе ArrayList лежит массив типа Object
+ Быстрая навигация по коллекции - осуществляется быстрый поиск элементов (возможности доступа к произвольному элементу по индексу);
+ меньше расходует памяти на хранение элементов;
- увеличение ArrayList происходит медленно;
- при вставке или удалении элемента в середину или в начало, приходится переписывать все элементы;
  У обычного массива нет динамического расширения. Мы обращаемся по массивам и размер фиксировао.
  На самом деле, эффект динамичности реализуется за счет простого фокуса. ArrayList это просто реализация массива. Каждый раз, когда массив обновляет размер, создаётся новый массив куда переходят старые значения и новый массив в два раза больше старого. Но из-за этого он медленный, особенно удаление. Есть альтернативы, например linkedlist
  Значение по умолчанию (capacity) для ArrayList равно 10.  Если знаем, что массив будет 100+, то можно сразу его указать, чтобы программа работала быстрее.
  Конвенция. Лучше ссылать arraylist на list. Тк arraylist насоедуется от list
  Т.е. ArrayList<Integer> ar = new ArrayList<>()
  А List<Integer> ar = new ArrayList<>()
  Работать будет одинаково
  
  Но польза, например если хотим много удалять, то. Может arr сослать на лист и эффективно удалять
  arr = new LinkedList<>() ну и перенести туда конечно. В общем мы не думаем о реализации нашего листа, не важно arraylist или linkedlist, можем поменять реализацию на ходу
  по умолчанию n = 10, при записи n+1 элемента, будет создан новый массив размером (n * 3) / 2 + 1, в него будут помещены все элементы из старого массива + новый, добавляемый элемент.
  При удалении произвольного элемента из списка, все элементы находящиеся «правее» смещаются на одну ячейку влево и реальный размер массива (его емкость, capacity) не изменяется никак. Механизм автоматического «расширения» массива существует, а вот автоматического «сжатия» нет, можно только явно выполнить «сжатие» командой trimToSize().
  LinkedList - двунаправленный список (цепочка), хранит элементы в объектах Node<E> (узлы), у которых есть ссылки на предыдущий и следующий элементы (используют, если элементы чаще добавляются, чем читаются). LinkedList — класс, реализующий два интерфейса — List и Deque. Это обеспечивает возможность создания двунаправленной очереди из любых (в том числе и null) элементов.

Элементы знают своих соседей И ТОЛЬКО ИХ. Иван знает, что ссылается на николая, а Николай на ивана. Звенья одной цепи. У каждого элемента имеется адрес предыдущего и след элемента.

Если хотим вызвать elena, то: name.set(2);
Порядок сохраняется, как добавили, так и выведется.
+ быстрая вставка и удаление в середину списка (переписать next и previous и всё);
- долгий поиск в середине (нужно перебрать все элементы. Идет с ivan и по цепочке);
  Очевидно, что плюсы одного являются минусами второго. В среднем, сложности одинаковые, но все же ArrayList предпочтительнее использовать. LinkedList рекомендуется использовать, только когда преобладает удаление или вставка в начало или конец списка. Но в основном используют ArrayList, он более универсален.
  
Добавить элемент в конец списка numbers.add(8);
Добавление объекта в середину связанного списка LinkedList позволяет добавить элемент в середину списка. Для этого используется метод add(index, element), где index — это место в списке, куда будет вставлен элемент element. numbers.add(1, 13);

###8. В чём отличие HashSet от TreeSet? ###
•	HashSet хранит данные в произвольном порядке (хранит свои значения как ключи HashMap).
•	TreeSet хранит данные в отсортированном виде (бинарное дерево). В основе TreeSet лежит TreeMap. У элементов данного TreeMap: ключи – это элементы TreeSet, значения – это константа-заглушка.
TreeSet обеспечивает упорядоченно хранение элементов в виде красно-черного дерева, которое умеет само себя балансировать. Сложность выполнения основных операций в TreeSet lg N. HashSet использует для хранения элементов такой же подход, что и HashMap, за тем отличием, что в HashSet в качестве ключа выступает сам элемент, кроме того HashSet (как и HashMap) не поддерживает упорядоченное хранение элементов и обеспечивает временную сложность выполнения операций аналогично HashMap.

###9. сет это список ключей от мапы ###
•	Map (карта отображений) – это объект, который хранит пару «ключ-значение».

Поиск объекта (значения) облегчается по сравнению с множествами за счет того, что его можно найти по его уникальному ключу.
Уникальность объектов - ключей должна обеспечивается переопределением методов hashCode() и equals() пользовательским классом.
Если элемент с указанным ключом отсутствует в карте, то возвращается значение null.
Уникальный ключ (k).
•	В основе любого Set лежит урезанная версия Map. Map хранил пары: ключ:значение. Set же пользуется внутри себя Map’ом. Для set пары не нужны, это значения. В основе HashSet находится объект HashMap, который и хранит в качестве ключей значения HashSet.

HashSet не запоминает порядок добавления элементов, так же как и HashMap. У HashMap: ключи – это элементы HashSet, значения – это константа-заглушка.

Set — это множество (так же называют «набором»). Set не допускает хранение двух одинаковых элементов. Формально говоря, термин «множество» и так обозначает совокупность различных элементов, очень важно, что именно различных элементов, так как это главное свойство Set. 

###10.Как задается порядок следования объектов в коллекции, как отсортировать коллекцию? ###

Порядок задается либо естественным следованием элементов (natural order), либо объектом, реализующим интерфейс сравнения Comparator.
Можно отсортировать с помощью интерфейса Comparable или интерфейса Comparator:

•	Если объекты коллекции поддерживают интерфейс Comparable, то через Collections.sort(collection);
•	Если нет, то у коллекции вызвать метод sort() и передать ему Comparator в качестве аргумента collection.sort(new MyComparator()). Либо использовать метод Collections.sort(collection, new MyComparator()).

###11.Чем отличается Comparable от Comparator? ###

**Comparable** - используется только для сравнения объектов класса, в котором данный интерфейс реализован. Т.е. интерфейс Comparable определяет логику сравнения объектов определенного ссылочного типа внутри своей реализации (по правилам разработчика). Collections.sort(collection);

**Comparator** - представляет отдельную реализацию и ее можно использовать многократно и с различными классами. Т.е. интерфейс Comparator позволяет создавать объекты, которые будут управлять процессом сравнения:
1.	при сортировках в методах Collections.sort(collection, new MyComparator()), Arrays.sort(array, new MyComparator()) или collection.sort(new MyComparator())
2.	при управлении порядком в отсортированных множествах TreeSet или отсортированных картах TreeMap, например new TreeSet<T> (new MyComparator()).
      Разница:
      •	Comparable определяет логику сравнения объектов определенного ссылочного типа внутри своей реализации и, если нет доступа к исходникам, ее невозможно изменить.
      •	Comparator позволает определить логику сравнения объектов определенного ссылочного типа вне реализации этого типа и эту логику можно в любой момент подменить.
      Comparable используется для natural ordering, а Comparator для total
      ordering.

###12.Что такое сортировка по принципу Natural Order? ###

Некоторые классы из коробки реализуют естественный порядок **natural order** для сортировки:
•	строки - лексикографический (по алфавиту),
•	числа - числовой, знаковый или без (больше меньше),
•	дата - хронологический (по датам),
•	файл - лексикографический по имени пути
•	boolean - false < true
Остальные классы нужно руками делать Comparable или Comparator.

###13.Что такое equals и hashcode? ###

Кратко:
Методы, необходимые для определения равенства объектов. hashcode возвращает число, являющееся уникальным идентификатором объекта. Это алгоритм, который позволяет множество значений объектов сузить до какого-то натурального количества. equals сравнивает объекты по значению их полей. Объекты всех коллекций в названии которых есть Hash... должны иметь hashcode и equals.

**Методы hashCode() и equals()** — базовые методы языка Java. На их основе работают коллекции. Оба эти метода объявлены в классе java.lang.Object. Дочерние классы могут, а в некоторых случаях даже должны переопределять их.

С примитивами всё просто. Мы сравниваем через == и всё хорошо. Но почему нельзя аналогично делать с объектами? Потому что == сравнивает по ссылкам, а не по параметрам объекта. Грубо говоря, == сравнивает, что два кота находят в одной квартире. А equals сравнивает именно параметры котов (цвет, возраст, длину хвоста). Чтобы сравнивать именно по параметрам надо переопределять метод equals
Если мы попробуем сейчас сравнить Васька.equals(Мурзик), то будет исключение. Просто потому что джава не знает, как именно сравнивать котов. Достаточно проверить только имена или надо проверять каждый параметр? Или можно посмотреть только города? Как точно надо сравнивать?
Правила для переопределения equals. Они не просто из головы взяты, а из документации:
1.	Рефлексивность. Объект всегда должен быть равен самому себе. Т.е. кот Мурзик всегда должен быть равен себе. В коде: if (this == murzik) return true;
2.	Симметричность. Если Васька равен Мурзику, то и Мурзик равен Ваське.
3.	Транзитивность. Если Васька равен Мурзику и Васька равен Кисе, то Мурзик тоже равен Кисе.
4.	Постоянность. Если параметры котов не менялись (возраст не увеличивался, хвост не отрастал), то сколько бы мы не вызывали метод equals, то он всегда должен возвращать один результат.
5.	При сравнение кота с null всегда должно возвращаться false.
      
      Пример переопределения: сравниваем, что это не одинаковые объекты; проверяем на null и что у нас передан точно кот, а не собака; сравниваем параметры (цвет, возраст, город).
      HashCode → это обычное значение int, которое соответствует объекту. Мы самостоятельно решаем как его вычислять.
      Про переопределение
      Переопределение equals и hashcode корректным путем, очень важно, когда мы работаем с коллекциями (особенно с hashMap, hashSet и тд).
      Переопределять методы нужно, чтобы они не были дефолтными (от класса Object)
      Правило: если переопределили equals, то желательно переопределить и hashcode. Методы hashMap, hashSet используют хэширование, поэтому и hashcode нужно переопределять.
      Хэширование в java – это преобразование с помощью метода hashcode любого объекта в int (поступает на вход объект, а на выходе int)
- Результат нескольких выполнений метода hashcode для одного и того объекта должен быть одинаковым.
- Если, согласно методу equals, два объекта равны, то и hashCode данных объектов обязательно должен быть одинаковым
- Если, согласно методу equals, два объекта НЕ равны, то и hashCode данных объектов НЕ обязательно должен быть разным

hashCode работает намного быстрее equals. Коллизии не избежать, если объектов много.

Что будет, если не переопределить метод hashcode():
Тогда с точки зрения метода equals два объекта будут логически равны, в то время как с точки зрения метода hashCode они не будут иметь ничего общего.

###14.Какие есть способы перебора всех элементов List? ###
       
•	через index (fori, while)
•	через iterator (while)
•	foreach

Есть список стран, его нужно перебрать
List<String> countries = Arrays.asList("Russia", "Panama", "Australia");

•	циклы for, while, foreach
```
for (int i = 0; i < countries.size(); i++) {
System.out.println(countries.get(i));
}
```
```
int i = 0;
while (i < countries.size()){
System.out.println(countries.get(i++));
}
```
```
for (String country : countries) {
System.out.println(country);
}
```
•	итераторы Iterator, ListIterator
```
Iterator<String> countriesIterator = countries.iterator();
while(countriesIterator.hasNext()) {
System.out.println(countriesIterator.next());
}
```

```
ListIterator<String> listIterator = countries.listIterator();
//в прямом порядке
while(listIterator.hasNext()) {
System.out.println(listIterator.next());
}
//в обратном порядке
while(listIterator.hasPrevious()) {
System.out.println(listIterator.previous());
}    
```
Если вызвать метод next() итератора, указывающего на последний элемент в коллекции, то возникнет исключение NoSuchElementException. Следует это помнить и использовать метод hasNext() перед вызовом next().
•	функция forEach()
•	Iterable.forEach() можно использовать для итерации по элементам списка начиная с Java 8. Этот метод определен в интерфейсе Iterable и может принимать лямбда-выражения в качестве параметра.
```
countries.forEach(System.out::println);
```
•	Stream.forEach() Мы также можем преобразовать коллекцию значений в поток и получить доступ к таким операциям, как forEach(), map(), или filter().
```
countries.stream().forEach(
(c) -> System.out.println(c)
);
```

###16.Как реализован цикл foreach? ###

for each loop можно использовать с массивами и с теми, кто реализует интерфейс java.lang.Iterable. Т.е. foreach реализован на основе Iterator, т.е. он работает для классов, реализующих интерфейс Iterable.
Можно реализовать интерфейс java.lang.Iterable и for each loop можно будет использовать и с вашим классом.
Если объект имеет класс, реализующий Iterable, он обязуется предоставлять при вызове метода iterator некий Итератор, который будет выполнять итерацию по содержимому этого объекта.

(И наоборот, если коллекция extends от Iterable, то мы можем перебирать элементы этой коллекции с помощью foreach)

###17.В чем разница между Iterator и Iterable? ###

**Iterator** – повторитель объекта. Сможем пробежаться по элементам ArrayList. (например методом .next). В отличии от foreach, в iterator мы можем удалить элементы нашей коллекции. Если есть какой-то метод, в который нужно передать элементы коллекции, то мы можем передать не саму коллекцию, а ее iterator.

У iterator есть методы hasNext, next, remove
Создание Iterator:   Iterator<DataType> name = Al.iterator();
Использование метода hasNext:    While (name.hasNext())
Метод next:    Sout(name.next())

Есть еще Listiterator, он расширяет возможности простого итератора. В нем можно работать не только с каждым следующим элементом используя next, но и с предыдущим тоже, используя previos. И другие методы.

И**нтерфейс Iterable** – это что угодно, что может возвращать интератор.
реализация интерфейса Iterable позволяет объекту быть целью оператора "foreach".
Один - тот кто ездит. Это Iterator
Другой - тот на ком ездят. Это Iterable
Первый не возможен без Второго. Второй возможен без первого, но бесполезен.
А на самом деле Iterable - всего лишь способ задать стандартный механизм извлечения итератора.
Например, у List есть ещё listIterator, к которому Iterable вообще никакого отношения не имеет. но тем не менее это настоящий итератор и даже упруженный дополнительными возможностями.

###18.Как происходит удаление элементов из ArrayList? ###

Находится заданный элемент. Далее сдвигаются влево на один элемент все последующие (с большим индексом) элементы, а значение size уменьшается на 1.
Непосредственно под капотом:
```
System.arraycopy(es, i + 1, es, i, newSize - i)
es[size = newSize] = null;
```
Удаление элементов в обычном массиве делается не удобно. Мы не можем удалить саму ячейку, нам остается только “обнулить” ее значение. Но при обнулении в массиве остается “дыра”. Мы ведь удаляем не ячейку, а только ее содержимое. Можно после удаления сдвинуть элементы массива к началу, так, чтобы “дыра” оказалась в конце, но это вряд ли можно назвать стабильным решением.
Но в классе ArrayList эта проблема успешно решена! В нем реализован специальный метод для удаления элементов — remove()
name.remove(1);
У метода remove() есть две особенности.
- он не оставляет “дыр”. В нем уже реализована логика сдвига элементов при удалении элемента из середины, которую мы ранее писали руками.
- он может удалять объект не только по индексу(как обычный массив), но и по ссылке на объект: name.remove(philipp);

###19.Как происходит удаление элементов из LinkedList? ###

Коротко:
Заменяются ссылки previous и next у соседних элементов.

Для удаления одного элемента из списка класс LinkedList предлагает нам аж 10 методов, различающихся по типу возвращаемого значения, наличию или отсутствию выбрасываемых исключений, а также способу указания, какой именно элемент следует удалить:

что же происходит при вызове метода remove(object)? Сначала искомый объект сравнивается по порядку со всеми элементами, сохраненными в узлах списка, начиная с нулевого узла. Когда найден узел, элемент которого равен искомому объекту, первым делом элемент сохраняется в отдельной переменной. Потом переопределяются ссылки соседних узлов так, чтобы они указывали друг на друга:

Затем обнуляется значение узла, который содержит удаляемый объект, а также уменьшается размер коллекции:

Теперь вернемся к тому моменту, что элемент из удаляемого узла мы сохраняли в памяти. Зачем мы это делали, спросите вы, если эти данные мы нигде дальше не использовали. Дело в том, что рассматриваемый нами метод в результате своей работу не возвращает удаленный элемент, потому данные, возврещенные вызванным в рамках работы метода unlink(node), вызванного методом remove(object), просто не понадобились. А вот когда мы используем метод remove(index), также вызывающий метод unlink(node), то значение данного элемента последовательно возвращается сначала методом unlink(node), а затем и методом remove(index).

###20.Назовите основные методы интерфейса Collections? ###

Основные:
```
int size()
boolean isEmpty()
boolean contains(Object o)
Iterator<E> iterator()
Object[] toArray()
boolean add(E e)
boolean remove(Object o)
void clear()
```
Остальные:
```
boolean containsAll(Collection<?> c)
boolean addAll(Collection<? extends E> c)
boolean removeAll(Collection<?> c)
boolean retainAll(Collection<?> c)
boolean equals(Object o)
int hashCode()
```
###21.Может ли null использоваться в качестве ключа в Map? ###

HashMap оперирует с null-ключом без каких-либо проблем. Его hash всегда равен 0.
В пустой TreeMap можно положить единственный null-ключ, все остальные операции (кроме size() и clear(), кстати) после этого не работают.
В непустой TreeMap положить null-ключ нельзя из-за обязательного вызова compareTo().

###22.Может ли Set содержать null? ###

для HashSet работает. TreeSet — только для первого элемента.

###23.Как преобразовать массив строк в ArrayList? ### 
```
Arrays.asList(words)
```
###24. Как отсортировать список в обратном порядке? ###
```
List reversedList = Collections.reverse(list)
```
###25. Какие реализации SortedSet вы знаете и в чем их особенность? ###

TreeSet - в основе лежит красно-черное дерево, которое умеет само себя балансировать.

TreeSet все равно в каком порядке вы добавляете в него элементы, преимущества этой структуры данных будут сохраняться.

###26. В каких случаях разумно использовать массив, а не ArrayList? ###

Рекомендация от Oracle: используйте ArrayList вместо массивов.

Если ответить на этот вопрос нужно по-другому, то можно сказать следующее: Массивы могут быть быстрее и кушать меньше памяти. Списки теряют в производительности из-за возможности автоматического увеличения размера и сопутствующих проверок.

###27.Как устроена HashMap? ###

HashMap состоит из «корзин» (bucket`ов). С технической точки зрения «корзины» — это элементы массива, которые хранят ссылки на списки элементов. При добавлении новой пары ключ-значение, вычисляет хеш-код ключа, на основании которого вычисляется номер корзины (номер ячейки массива), в которую попадет новый элемент. Если корзина пустая, то в нее сохраняется ссылка на вновь добавляемый элемент, если же там уже есть элемент, то происходит последовательный переход по ссылкам между элементами в цепочке, в поисках последнего элемента, от которого и ставится ссылка на вновь добавленный элемент. Если в списке был найден элемент с таким же ключом, то он заменяется. Добавление, поиск и удаление элементов выполняется за константное время. Вроде все здорово, с одной оговоркой, хеш-функций должна равномерно распределять элементы по корзинам, в этом случае временная сложность для этих 3 операций будет не ниже lg N, а в среднем случае как раз константное время.

###28.Максимальное число значений hashCode()? ###

Здесь все довольно просто, достаточно вспомнить сигнатуру метода: int hashCode(). То есть число значений равно диапазону типа int — 2^32 (точного диапазона никогда не спрашивали, хватало такого ответа).