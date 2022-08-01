/*
 * OpenAPI Petstore
 *
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */


use reqwest;

use crate::apis::ResponseContent;
use super::{Error, configuration};

/// struct for passing parameters to the method [`delete_order`]
#[derive(Clone, Debug, Default)]
pub struct DeleteOrderParams {
    /// ID of the order that needs to be deleted
    pub order_id: String
}

/// struct for passing parameters to the method [`get_order_by_id`]
#[derive(Clone, Debug, Default)]
pub struct GetOrderByIdParams {
    /// ID of pet that needs to be fetched
    pub order_id: i64
}

/// struct for passing parameters to the method [`place_order`]
#[derive(Clone, Debug, Default)]
pub struct PlaceOrderParams {
    /// order placed for purchasing the pet
    pub order: crate::models::Order
}


/// struct for typed successes of method [`delete_order`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum DeleteOrderSuccess {
    UnknownValue(serde_json::Value),
}

/// struct for typed successes of method [`get_inventory`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum GetInventorySuccess {
    Status200(::std::collections::HashMap<String, i32>),
    UnknownValue(serde_json::Value),
}

/// struct for typed successes of method [`get_order_by_id`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum GetOrderByIdSuccess {
    Status200(crate::models::Order),
    UnknownValue(serde_json::Value),
}

/// struct for typed successes of method [`place_order`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum PlaceOrderSuccess {
    Status200(crate::models::Order),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`delete_order`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum DeleteOrderError {
    Status400(),
    Status404(),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`get_inventory`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum GetInventoryError {
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`get_order_by_id`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum GetOrderByIdError {
    Status400(),
    Status404(),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`place_order`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum PlaceOrderError {
    Status400(),
    UnknownValue(serde_json::Value),
}


/// For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will generate API errors
pub async fn delete_order(configuration: &configuration::Configuration, params: DeleteOrderParams) -> Result<ResponseContent<DeleteOrderSuccess>, Error<DeleteOrderError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let order_id = params.order_id;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/store/order/{orderId}", local_var_configuration.base_path, orderId=crate::apis::urlencode(order_id));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::DELETE, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        let local_var_entity: Option<DeleteOrderSuccess> = serde_json::from_str(&local_var_content).ok();
        let local_var_result = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Ok(local_var_result)
    } else {
        let local_var_entity: Option<DeleteOrderError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Returns a map of status codes to quantities
pub async fn get_inventory(configuration: &configuration::Configuration) -> Result<ResponseContent<GetInventorySuccess>, Error<GetInventoryError>> {
    let local_var_configuration = configuration;

    // unbox the parameters


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/store/inventory", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_apikey) = local_var_configuration.api_key {
        let local_var_key = local_var_apikey.key.clone();
        let local_var_value = match local_var_apikey.prefix {
            Some(ref local_var_prefix) => format!("{} {}", local_var_prefix, local_var_key),
            None => local_var_key,
        };
        local_var_req_builder = local_var_req_builder.header("api_key", local_var_value);
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        let local_var_entity: Option<GetInventorySuccess> = serde_json::from_str(&local_var_content).ok();
        let local_var_result = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Ok(local_var_result)
    } else {
        let local_var_entity: Option<GetInventoryError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// For valid response try integer IDs with value <= 5 or > 10. Other values will generated exceptions
pub async fn get_order_by_id(configuration: &configuration::Configuration, params: GetOrderByIdParams) -> Result<ResponseContent<GetOrderByIdSuccess>, Error<GetOrderByIdError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let order_id = params.order_id;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/store/order/{orderId}", local_var_configuration.base_path, orderId=order_id);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        let local_var_entity: Option<GetOrderByIdSuccess> = serde_json::from_str(&local_var_content).ok();
        let local_var_result = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Ok(local_var_result)
    } else {
        let local_var_entity: Option<GetOrderByIdError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// 
pub async fn place_order(configuration: &configuration::Configuration, params: PlaceOrderParams) -> Result<ResponseContent<PlaceOrderSuccess>, Error<PlaceOrderError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let order = params.order;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/store/order", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    local_var_req_builder = local_var_req_builder.json(&order);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        let local_var_entity: Option<PlaceOrderSuccess> = serde_json::from_str(&local_var_content).ok();
        let local_var_result = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Ok(local_var_result)
    } else {
        let local_var_entity: Option<PlaceOrderError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

