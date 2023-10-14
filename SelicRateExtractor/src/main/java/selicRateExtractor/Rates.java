package selicRateExtractor;

public enum Rates {
	SELIC;
	
	public String getURL() {
		switch(this) {
		case SELIC:
			return "https://www3.bcb.gov.br/CALCIDADAO/publico/exibirFormCorrecaoValores.do?method=exibirFormCorrecaoValores&aba=4";
		default:
			return "Taxa não encontrada!";
		}
	}
	
	public String getDataInicialFieldName() {
		switch(this) {
		case SELIC:
			return "dataInicial";
		default:
			return "Taxa não encontrada!";
		}
	}
	
	public String getDataFinalFieldName() {
		switch(this) {
		case SELIC:
			return "dataFinal";
		default:
			return "Taxa não encontrada!";
		}
	}
	
	public String getValorCorrecaoFieldName() {
		switch(this) {
		case SELIC:
			return "valorCorrecao";
		default:
			return "Taxa não encontrada!";
		}
	}
	
	public String getvalor() {
		return "10000";
	}
}
