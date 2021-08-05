<?php

return (new PhpCsFixer\Config)
    ->setUsingCache(true)
    ->setRules([
        '@PSR2' => true,
        'ordered_imports' => true,
        'phpdoc_order' => true,
        'array_syntax' => [ 'syntax' => 'short' ],
        'no_trailing_whitespace' => false,
        'no_trailing_whitespace_in_comment' => false,
        'braces' => false,
        'single_blank_line_at_eof' => false,
        'single_quote' => true,
        'blank_line_after_namespace' => false,
    ])
    ->setFinder(
        PhpCsFixer\Finder::create()
        ->in(__DIR__)
    );
