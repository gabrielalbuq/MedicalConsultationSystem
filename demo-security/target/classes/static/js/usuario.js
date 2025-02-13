//datatables - lista de médicos
$(documento).ready(função() {
	momento.locale('pt-BR');
	var tabela = $('#tabela-usuários').DataTable({
		procurando: verdadeiro,
		comprimentoMenu: [ 5, 10 ],
		processamento: verdadeiro,
		serverSide: verdadeiro,
		responsivo: verdadeiro,
		ajax : {
			url : '/u/datatables/server/usuarios',
			dados: 'dados'
		},
		colunas: [
				{dados : 'id'},
				{dados : 'e-mail'},
				{ dados : 'ativo',
					render : função(ativo) {
						return ativo == verdadeiro ? 'Sim': 'Não';
					}
				},
				{ dados : 'perfis',									 
					renderizar : função(perfis) {
						var aux = novo Array();
						$.each(perfis, função(índice, valor) {
							  aux.push(valor.desc);
						});
						retornar aux;
					},
					ordenável: falso,
				},
				{ dados : 'id',	
					renderizar : função(id) {
						retornar ''.concat('<a class="btn btn-sucesso btn-sm btn-bloco"', ' ')
								 .concat('href="').concat('/u/editar/credenciais/usuario/').concat(id, '"', ' ')
								 .concat('role="button" title="Editar" data-toggle="tooltip" data-placement="right">', ' ')
								 .concat('<i class="fas fa-edit"></i></a>');
					},
					ordenável: falso
				},
				{ dados : 'id',	
					renderizar : função(id) {
						retornar ''.concat('<a class="btn btn-info btn-sm btn-bloco"', ' ')
								 .concat('id="dp_').concat(id).concat('"', ' ')
								 .concat('role="button" title="Editar" data-toggle="tooltip" data-placement="right">', ' ')
								 .concat('<i class="fas fa-edit"></i></a>');
					},
					ordenável: falso
				}
		]
	});
	
});	