package org.springframework.ai.node;

import java.util.Map;

/**
 * A simple data structure that contains content and metadata.
 *
 * @param <T> the type of content in the node
 * @author Mark Pollack
 * @since 1.0 M1
 */
public interface Node<T> {

	T getContent();

	Map<String, Object> getMetadata();

}