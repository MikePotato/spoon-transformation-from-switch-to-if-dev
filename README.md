# spoon-transformation-from-switch-to-if-dev

## Remarks
Проект в данном репозитории использует JDK 19 и включает в себя как и основную реализацию, так и тесты для разных конфигураций оператора\выражения switch. 

Основной причиной создания данной версии проекта послужило то, что проект созданный на JDK11 не предоставлял простого способа реализовать тестирование результата работы программы. 

Также следует отметить, что код данного проекта не использует фичи языка java старше 11 версии, поэтому при изменении JDK11 и удалении тестов для оператора\выражения switch под версию > 11 проект успешно скомпилится. По следующей ссылке доступен этот же самый проект, но с урезанными тестами и jdk 11 - https://github.com/MikePotato/spoon-transformation-from-switch-to-if

## Get started

Для запуска взять java_code_source_processor.jar из [https://github.com/MikePotato/spoon-transformation-from-switch-to-if-dev/tree/main/java_code_source_processor/out/artifacts](https://github.com/MikePotato/spoon-transformation-from-switch-to-if/tree/main/java_code_source_processor_JDK11/out/artifacts) и запустить с указанием параметров --ARG_NAME_FOR_INPUT и --ARG_NAME_FOR_OUTPUT:

```
java -jar c:\java_code_source_processor.jar --ARG_NAME_FOR_INPUT D:\in\java_code_source_input\src --ARG_NAME_FOR_OUTPUT d:\out
```

В качестве проекта для конвертации можно использовать проект вот отсюда: https://github.com/MikePotato/spoon-transformation-from-switch-to-if/tree/main/java_code_source_input

### NOTES 

1. Для параметра --ARG_NAME_FOR_INPUT лучше указывать непосредственно папку с java файлами. Если указать весь проект, то spoon может немного структурно поломать его. 

2. Тест TaskSnippetsTests на функционнальную тождественность методов из задания не проходил, поэтому был закомментирован.
