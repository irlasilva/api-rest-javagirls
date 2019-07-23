package controllers;

@RestController
@RequestMapping("/contacts")
public class ContactController {
	@Autowired
	private ContactService contactService;

	@PostMapping
	public ResponseEntity<Contact> create(@Valid @RequestBody Contact contact) {
	Contact obj = contactService.save(contact);]
	URI uri = ServletUriComponentBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getid()).toUri();
	return ResponseEntity.created(uri).body(obj);
	}
}
