//
//  LanguageDetector.swift
//  LanguageDetector
//
//  Created by Kevin Velasco on 12/12/19.
//  Copyright © 2019 Facebook. All rights reserved.
//

import Foundation

@objc(LanguageDectector)
class LanguageDectector: NSObject {
  
  @objc
  func constantsToExport () -> [AnyHashable: Any]! {
   return ["locale": NSLocale.current.languageCode]

  }
}
