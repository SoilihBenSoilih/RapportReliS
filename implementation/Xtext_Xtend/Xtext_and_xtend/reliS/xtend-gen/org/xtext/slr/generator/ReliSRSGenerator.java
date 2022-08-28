/**
 * generated by Xtext 2.14.0
 */
package org.xtext.slr.generator;

import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.slr.reliSRS.CDecision;
import org.xtext.slr.reliSRS.Classification;
import org.xtext.slr.reliSRS.ConflictResolution;
import org.xtext.slr.reliSRS.DecisionPerUser;
import org.xtext.slr.reliSRS.Model;
import org.xtext.slr.reliSRS.Participants;
import org.xtext.slr.reliSRS.Phases;
import org.xtext.slr.reliSRS.RDecision;
import org.xtext.slr.reliSRS.Result;
import org.xtext.slr.reliSRS.StatisticsOnExclusionCriteria;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class ReliSRSGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Model> _filter = Iterables.<Model>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Model.class);
    for (final Model e : _filter) {
      fsa.generateFile(resource.getURI().toString().replace("slr", "tex"), this.latex(e));
    }
  }
  
  private CharSequence latex(final Model md) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t");
    _builder.append("\\documentclass{article}");
    _builder.newLine();
    _builder.append("\t\t\t\t    ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\\usepackage[utf8]{inputenc}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\\usepackage[english]{babel}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\\usepackage{hyperref}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\\usepackage[dvipsnames]{xcolor}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\\usepackage{tikz}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\\usepackage{pgfplots}");
    _builder.newLine();
    _builder.append("\t\t\t\t    ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\\title{\\textcolor{blue}{");
    String _projectName = md.getProjectName();
    _builder.append(_projectName, "\t\t");
    _builder.append("}}");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t ");
    CharSequence _authors = this.authors(md.getParticipants());
    _builder.append(_authors, "\t\t ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t    ");
    _builder.newLine();
    _builder.append("\\date{\\today}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\begin{document}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\maketitle");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\newpage");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\begin{abstract}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Ce document est g�n�r� automatiquement en latex � partir d\'un mod�le de projet Relis. Il est fait pour expliquer avec des mots les donn�es du screening d\'un projet ReliS afin que l\'on puisse comprendre les chiffres affich�s et leurs significations.");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\end{abstract}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\newpage");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\frontmatter");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\tableofcontents");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\newpage");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\section{Introduction}");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.newLine();
    _builder.append("Ce projet est projet d�v�lopp� dans ReliS, un outil avec lequel on peut faire des r�vues syst�matiques. Ce document est fait pour mettre des mots sur les donn�es afin de rendre plus clair le r�sultat de la r�vue faite dans Relis.  Vous y trouverez notamment les auteurs, leurs r�les, les phases du projet et les donn�es de chaque phase de mani�res structur�s et d�taill�e.");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\newpage");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\section{Participants et r�les}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Ici, on peut voir le nom de chaque participant et son r�le dans le projet: \\\\");
    _builder.newLine();
    _builder.newLine();
    CharSequence _roles = this.roles(md.getParticipants());
    _builder.append(_roles);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\\newpage");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\section{Le screening}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Le screening du projet est caract�ris� par le(s) �tape(s) suivante(s) :");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\begin{itemize}");
    _builder.newLine();
    {
      EList<Phases> _phase = md.getPhase();
      for(final Phases m : _phase) {
        CharSequence _screeningPhases = this.screeningPhases(m);
        _builder.append(_screeningPhases);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\\end{itemize}");
    _builder.newLine();
    _builder.append("\\\\ \\\\");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Le screening est l\'�tape la plus crutiale, c\'est � la fin de ce dernier qu\'on sait ce qui va �tre inclus dans l\'�tude. ");
    _builder.newLine();
    _builder.append("Les articles peuvent prov�nir de diff�rentes sources et �tre � nombre astronomique au d�part. Toutefois, chaque article");
    _builder.newLine();
    _builder.append("n\'est pas forc�ment pertinent pour le contexte et l\'�tude en question. C\'est pour cela qu\'il faut faire un tri.");
    _builder.newLine();
    _builder.append("On peut diviser le screening en plusieurs phases pour simplifier les choses. On peut par exemple dire qu\'� la phase 1, on");
    _builder.newLine();
    _builder.append("ne se pr�occupe que du titre et de l\'abstract, et qu\'� la phase 2, on regardera les autres parties qui composent un article. \\\\");
    _builder.newLine();
    _builder.append("Plusieurs chercheurs peuvent �tre impliqu�s pendant cette �tape. \\\\");
    _builder.newLine();
    _builder.append("Le screening est compos� de quatre piliers cl�s: \\\\");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\begin{enumerate}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\\item \\textbf{Les d�cisions d\'inclusion et d\'exclusion de chaque chercheur}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\\item \\textbf{Les crit�res automatiques d\'exclusion}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\\item \\textbf{La r�solution des conflits}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\\item \\textbf{Les r�sultats}");
    _builder.newLine();
    _builder.append("\\end{enumerate}");
    _builder.newLine();
    _builder.append("\\\\");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Nous allons donner plus de d�tails sur chacune sur ces �tapes.");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\newpage");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\subsection{Les d�cisions d\'inclusion et d\'exclusion de chaque chercheur}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Un projet de recherche peut n�cessiter le travail de toute une �quipe parce que, tr�s laborieux.");
    _builder.newLine();
    _builder.append("Dans ReliS, on peut travailler avec autant de personne que l\'on souhaite. Chaque chercheurs, selon");
    _builder.newLine();
    _builder.append("son r�le, peut inclure et exclure des articles ici.");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\subsection{Les crit�res automatiques d\'exclusion}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("On peut aussi, d�finir des crit�res d\'exclusion qui, eux, vont exclure des articles de mani�re automatique.");
    _builder.newLine();
    _builder.append("Les crit�res d\'exclusions peuvent �tre aussi nombreuses que souhait�s.");
    _builder.newLine();
    _builder.append("Dans cette partie l�, chaque article qui r�pond � au moins un des crit�res d\'exclusions est �cart�.");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\subsection{La r�solution des conflits}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Vu que chaque chercheurs inclut des articles et en exclut d\'autres comme il lui semble juste, il peut arriver");
    _builder.newLine();
    _builder.append("qu\'un chercheur inclut une �tude qu\'un autre chercheur a exclu et inversement. Ce sont ces genres de situations");
    _builder.newLine();
    _builder.append("qui sont traduits par les conflits. Il faut toutefois, � l\'unanimit�, r�soudre tous ces conflits pour pouvoir");
    _builder.newLine();
    _builder.append("passer � la suite.");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\subsection{Les r�sultats}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Les r�sultats traduisent quant � eux les donn�es d\'inclusion et d\'autres de l\'ensemble des cherchercheurs pour la phase concern�e.");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\newpage");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\section{Les phases du screening pour l\'�tude}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Dans la suite, nous allons d�tailler les donn�es de chaque phase du screening. \\\\ ");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    {
      EList<Phases> _phase_1 = md.getPhase();
      for(final Phases m_1 : _phase_1) {
        CharSequence _phases = this.phases(m_1);
        _builder.append(_phases);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("\\newpage");
    _builder.newLine();
    _builder.append("\t    \t    ");
    _builder.newLine();
    _builder.append("\\section{La classification}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Une �tude est compos� de 3 �tapes: \\\\");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\begin{itemize}");
    _builder.newLine();
    _builder.append("\\item \\textbf{la collection des articles:} tous les articles impliqu�s sont s�l�ctionn�es.");
    _builder.newLine();
    _builder.append("\\item \\textbf{le screening:} ici un tri est effectu� et les articles finaux sont connus � la fin de cette phase.");
    _builder.newLine();
    _builder.append("\\item \\textbf{la classification:} cette �tape marque la fin de l\'�tude et c\'est ici o� les questions sont r�pondues.");
    _builder.newLine();
    _builder.append("\\\\");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\subsection{R�sultats de la classification du projet}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Les donn�es suivantes sont les questions et les statistiques des r�ponses de la classification. \\\\");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    CharSequence _classif = this.classif(md.getClassification());
    _builder.append(_classif);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\\end{itemize}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\newpage");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\section{Conclusion}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Notre court article r�sumant et expliquant vos donn�es se termine ici dans l\'espoir qu\'il vous a aid� � voir un peu plus clairement les donn�es de votre revue syst�matique avec ReliS. \\\\\t    ");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.newLine();
    _builder.append("\\end{document}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence classif(final Classification c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    {
      int _size = c.getResponse().size();
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
      for(final Integer i : _doubleDotLessThan) {
        _builder.append("\t\t ");
        _builder.append("\\large{\\textbf{");
        String _get = c.getQuestion().get((i).intValue());
        _builder.append(_get, "\t\t ");
        _builder.append(" ? }} \\\\ \\\\");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t ");
        _builder.append("\\textit{");
        String _get_1 = c.getResponse().get((i).intValue());
        _builder.append(_get_1, "\t\t ");
        _builder.append(" : ");
        String _get_2 = c.getResultat().get((i).intValue());
        _builder.append(_get_2, "\t\t ");
        _builder.append("} \\\\ \\\\");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t ");
        _builder.append("\\begin{tikzpicture}[scale=1]");
        _builder.newLine();
        _builder.append("\t\t ");
        _builder.append("\\begin{axis}[ybar,xticklabels={");
        String _get_3 = c.getResponse().get((i).intValue());
        _builder.append(_get_3, "\t\t ");
        _builder.append("}]");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t ");
        _builder.append("\\addplot coordinates{(");
        _builder.append(i, "\t\t ");
        _builder.append(",");
        String _get_4 = c.getResultat().get((i).intValue());
        _builder.append(_get_4, "\t\t ");
        _builder.append(")};");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t ");
        _builder.append("\\end{axis}");
        _builder.newLine();
        _builder.append("\t\t ");
        _builder.append("\\end{tikzpicture} \\\\ \\\\");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  private CharSequence screeningPhases(final Phases p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\item ");
    String _phaseName = p.getPhaseName();
    _builder.append(_phaseName);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence phases(final Phases ph) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("\\subsection{Phase: ");
    String _phaseName = ph.getPhaseName();
    _builder.append(_phaseName);
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\\subsubsection{Inclusions et exclusions de chaque chercheur}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Les donn�es dans le tableau suivant traduisent ce que les participants du projet ont inclus et exclu dans cette phase: \\\\");
    _builder.newLine();
    _builder.newLine();
    CharSequence _participants = this.participants(ph.getDecisionPerUser());
    _builder.append(_participants);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\\newpage");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\subsubsection{Les crit�res d\'exclusion}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Le tableau suivant d�finit les crit�res d\'exclusions dans cette phase: \\\\");
    _builder.newLine();
    _builder.newLine();
    CharSequence _exclusions = this.exclusions(ph.getStatisticsOnExclusionCriteria());
    _builder.append(_exclusions);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\\newpage");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\subsubsection{R�solution des conflits}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Ici, on peut observer l\'�tat de la r�solution des conflits encore une fois dans cette phase: \\\\");
    _builder.newLine();
    _builder.newLine();
    CharSequence _conflicts = this.conflicts(ph.getConflictResolution());
    _builder.append(_conflicts);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\\newpage");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\subsubsection{R�sultats}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Les r�sultats de cette phase sont r�sum� dans le tableau qui suit: \\\\");
    _builder.newLine();
    _builder.newLine();
    CharSequence _results = this.results(ph.getResult());
    _builder.append(_results);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\\newpage");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence authors(final Participants p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\author{");
    String _get = p.getParticipant().get(0);
    _builder.append(_get);
    _builder.newLineIfNotEmpty();
    {
      int _size = p.getParticipant().size();
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        {
          int _size_1 = p.getParticipant().size();
          ExclusiveRange _doubleDotLessThan = new ExclusiveRange(1, _size_1, true);
          for(final Integer i : _doubleDotLessThan) {
            _builder.append("\\and ");
            String _get_1 = p.getParticipant().get((i).intValue());
            _builder.append(_get_1);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence roles(final Participants p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\begin{tabular}{|l||r|}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\hline");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("Participants & R�le \\\\");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\hline  ");
    _builder.newLine();
    String _get = p.getParticipant().get(0);
    _builder.append(_get);
    _builder.append(" & ");
    String _get_1 = p.getRole().get(0);
    _builder.append(_get_1);
    _builder.append(" \\\\");
    _builder.newLineIfNotEmpty();
    _builder.append("\\hline");
    _builder.newLine();
    {
      int _size = p.getParticipant().size();
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        {
          int _size_1 = p.getParticipant().size();
          ExclusiveRange _doubleDotLessThan = new ExclusiveRange(1, _size_1, true);
          for(final Integer i : _doubleDotLessThan) {
            String _get_2 = p.getParticipant().get((i).intValue());
            _builder.append(_get_2);
            _builder.append(" & ");
            String _get_3 = p.getRole().get((i).intValue());
            _builder.append(_get_3);
            _builder.append(" \\\\");
            _builder.newLineIfNotEmpty();
            _builder.append("\\hline");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("\\end{tabular}");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence participants(final DecisionPerUser participants) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\begin{tabular}{|l||r||r||r|}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\hline");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("User & Included & Excluded & In conflict \\\\");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\hline  ");
    _builder.newLine();
    String _get = participants.getDUser().get(0);
    _builder.append(_get);
    _builder.append(" & ");
    String _get_1 = participants.getDIncluded().get(0);
    _builder.append(_get_1);
    _builder.append(" & ");
    String _get_2 = participants.getDExcluded().get(0);
    _builder.append(_get_2);
    _builder.append(" & ");
    String _get_3 = participants.getDInConflict().get(0);
    _builder.append(_get_3);
    _builder.append(" \\\\");
    _builder.newLineIfNotEmpty();
    _builder.append("\\hline");
    _builder.newLine();
    {
      int _size = participants.getDUser().size();
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        {
          int _size_1 = participants.getDUser().size();
          ExclusiveRange _doubleDotLessThan = new ExclusiveRange(1, _size_1, true);
          for(final Integer i : _doubleDotLessThan) {
            String _get_4 = participants.getDUser().get((i).intValue());
            _builder.append(_get_4);
            _builder.append(" & ");
            String _get_5 = participants.getDIncluded().get((i).intValue());
            _builder.append(_get_5);
            _builder.append(" & ");
            String _get_6 = participants.getDExcluded().get((i).intValue());
            _builder.append(_get_6);
            _builder.append(" & ");
            String _get_7 = participants.getDInConflict().get((i).intValue());
            _builder.append(_get_7);
            _builder.append(" \\\\");
            _builder.newLineIfNotEmpty();
            _builder.append("\\hline");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("\\end{tabular}");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence exclusions(final StatisticsOnExclusionCriteria exclusions) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\begin{tabular}{|l||r||r|}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\hline");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Criteria & Number & Percentage \\\\");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\hline  ");
    _builder.newLine();
    String _get = exclusions.getSCriteria().get(0);
    _builder.append(_get);
    _builder.append(" & ");
    String _get_1 = exclusions.getSNombre().get(0);
    _builder.append(_get_1);
    _builder.append(" & ");
    String _get_2 = exclusions.getSPourcentage().get(0);
    _builder.append(_get_2);
    _builder.append(" \\\\");
    _builder.newLineIfNotEmpty();
    _builder.append("\\hline");
    _builder.newLine();
    {
      int _size = exclusions.getSCriteria().size();
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        {
          int _size_1 = exclusions.getSCriteria().size();
          ExclusiveRange _doubleDotLessThan = new ExclusiveRange(1, _size_1, true);
          for(final Integer i : _doubleDotLessThan) {
            String _get_3 = exclusions.getSCriteria().get((i).intValue());
            _builder.append(_get_3);
            _builder.append(" & ");
            String _get_4 = exclusions.getSNombre().get((i).intValue());
            _builder.append(_get_4);
            _builder.append(" & ");
            String _get_5 = exclusions.getSPourcentage().get((i).intValue());
            _builder.append(_get_5);
            _builder.append(" \\\\");
            _builder.newLineIfNotEmpty();
            _builder.append("\\hline");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("\\end{tabular}");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence conflicts(final ConflictResolution conflicts) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\begin{tabular}{|l||r|}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\hline");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Decision & Number \\\\");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\hline  ");
    _builder.newLine();
    CDecision _get = conflicts.getCDecision().get(0);
    _builder.append(_get);
    _builder.append(" & ");
    String _get_1 = conflicts.getCNombre().get(0);
    _builder.append(_get_1);
    _builder.append(" \\\\");
    _builder.newLineIfNotEmpty();
    _builder.append("\\hline");
    _builder.newLine();
    {
      int _size = conflicts.getCDecision().size();
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        {
          int _size_1 = conflicts.getCDecision().size();
          ExclusiveRange _doubleDotLessThan = new ExclusiveRange(1, _size_1, true);
          for(final Integer i : _doubleDotLessThan) {
            CDecision _get_2 = conflicts.getCDecision().get((i).intValue());
            _builder.append(_get_2);
            _builder.append(" & ");
            String _get_3 = conflicts.getCNombre().get((i).intValue());
            _builder.append(_get_3);
            _builder.append(" \\\\");
            _builder.newLineIfNotEmpty();
            _builder.append("\\hline");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("\\end{tabular}");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence results(final Result results) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\begin{tabular}{|l||r||r|}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\hline");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Decision & Papers & Percentage \\\\");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\\hline  ");
    _builder.newLine();
    RDecision _get = results.getRDecision().get(0);
    _builder.append(_get);
    _builder.append(" & ");
    String _get_1 = results.getRPaper().get(0);
    _builder.append(_get_1);
    _builder.append(" & ");
    String _get_2 = results.getRPourcentage().get(0);
    _builder.append(_get_2);
    _builder.append(" \\\\");
    _builder.newLineIfNotEmpty();
    _builder.append("\\hline");
    _builder.newLine();
    {
      int _size = results.getRDecision().size();
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        {
          int _size_1 = results.getRDecision().size();
          ExclusiveRange _doubleDotLessThan = new ExclusiveRange(1, _size_1, true);
          for(final Integer i : _doubleDotLessThan) {
            RDecision _get_3 = results.getRDecision().get((i).intValue());
            _builder.append(_get_3);
            _builder.append(" & ");
            String _get_4 = results.getRPaper().get((i).intValue());
            _builder.append(_get_4);
            _builder.append(" & ");
            String _get_5 = results.getRPourcentage().get((i).intValue());
            _builder.append(_get_5);
            _builder.append(" \\\\");
            _builder.newLineIfNotEmpty();
            _builder.append("\\hline");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("\\hline");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Total & ");
    String _rTotal = results.getRTotal();
    _builder.append(_rTotal, "  ");
    _builder.append(" \\\\");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("\\hline");
    _builder.newLine();
    _builder.append("\\end{tabular}");
    _builder.newLine();
    return _builder;
  }
}
