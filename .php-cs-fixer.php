<?php

return (new PhpCsFixer\Config)
    ->setUsingCache(true)
    ->setRules([
        
        '@Symfony' => true,
        'array_syntax' => ['syntax' => 'short'],
        'array_indentation' => true,
        'braces' => true,
        'ordered_class_elements' => [
            'order' => [
                'use_trait',
                'constant_public',
                'constant_protected',
                'constant_private',
                'property_public',
                'property_protected',
                'property_private',
                'construct',
                'destruct',
                'magic',
                'phpunit',
                'method_public',
                'method_protected',
                'method_private',
        ],
        #'sort_algorithm' => 'alpha',
        #'@PSR2' => true,
        #'ordered_imports' => true,
        #'phpdoc_order' => true,
        #'no_trailing_whitespace' => false,
        #'no_trailing_whitespace_in_comment' => false,
        #'single_blank_line_at_eof' => false,
        #'single_quote' => true,
        #'blank_line_after_namespace' => false,
        ],
    ])
    ->setFinder(
        PhpCsFixer\Finder::create()
        ->in(__DIR__)
    );
