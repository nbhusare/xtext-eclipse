/*
 * generated by Xtext
 */
package org.eclipse.xtext.common.types.xtext.ui.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.xtext.ui.contentAssistTestLanguage.ContentAssistTestLanguagePackage;
import org.eclipse.xtext.common.types.xtext.ui.contentAssistTestLanguage.GenerateDirective;
import org.eclipse.xtext.common.types.xtext.ui.contentAssistTestLanguage.Import;
import org.eclipse.xtext.common.types.xtext.ui.contentAssistTestLanguage.Model;
import org.eclipse.xtext.common.types.xtext.ui.contentAssistTestLanguage.ReferenceHolder;
import org.eclipse.xtext.common.types.xtext.ui.services.ContentAssistTestLanguageGrammarAccess;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ContentAssistTestLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ContentAssistTestLanguageGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ContentAssistTestLanguagePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ContentAssistTestLanguagePackage.GENERATE_DIRECTIVE:
				sequence_GenerateDirective(context, (GenerateDirective) semanticObject); 
				return; 
			case ContentAssistTestLanguagePackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case ContentAssistTestLanguagePackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case ContentAssistTestLanguagePackage.REFERENCE_HOLDER:
				sequence_ReferenceHolder(context, (ReferenceHolder) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     typeName=QN
	 */
	protected void sequence_GenerateDirective(EObject context, GenerateDirective semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ContentAssistTestLanguagePackage.Literals.GENERATE_DIRECTIVE__TYPE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ContentAssistTestLanguagePackage.Literals.GENERATE_DIRECTIVE__TYPE_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGenerateDirectiveAccess().getTypeNameQNParserRuleCall_1_0(), semanticObject.getTypeName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=ImportedFQN
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ContentAssistTestLanguagePackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ContentAssistTestLanguagePackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceImportedFQNParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (imports+=Import* generateDirective=GenerateDirective? referenceHolder=ReferenceHolder?)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (defaultReference=[JvmType|FQN] | customizedReference=[JvmType|FQN] | subtypeReference=[JvmType|FQN])
	 */
	protected void sequence_ReferenceHolder(EObject context, ReferenceHolder semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}