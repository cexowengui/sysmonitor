package angus.gmoni.service

import java.nio.file.Path

import angus.gmoni.domain.FileInfo;


interface FileService {
	
	FileInfo getPath(String path) throws IOException

}