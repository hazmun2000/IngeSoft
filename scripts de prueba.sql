SELECT medicamentoinvima.NOMBREMEDICAMENTO, medicamentoinvima.TITULAR, medicamentoinvima.DESCRIPCION, medicamentoinvima.PRESENTACION, medicamentoinvima.PRINCIPIOACTIVO, medicamento.STOCK, medicamento.PRECIOVENTA
from medicamentoinvima, medicamento
WHERE medicamentoinvima.IDMEDICAMENTOINVIMA=medicamento.IDMEDICAMENTOINVIMA;