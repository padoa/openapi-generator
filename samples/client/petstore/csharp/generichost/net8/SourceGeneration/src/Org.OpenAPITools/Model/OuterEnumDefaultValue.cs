// <auto-generated>
/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

#nullable enable

using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Text.Json;
using System.Text.Json.Serialization;
using System.ComponentModel.DataAnnotations;
using OpenAPIClientUtils = Org.OpenAPITools.Client.ClientUtils;
using System.Text.Json.Serialization.Metadata;
using Org.OpenAPITools.Client;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Defines OuterEnumDefaultValue
    /// </summary>
    public enum OuterEnumDefaultValue
    {
        /// <summary>
        /// Enum Placed for value: placed
        /// </summary>
        Placed = 1,

        /// <summary>
        /// Enum Approved for value: approved
        /// </summary>
        Approved = 2,

        /// <summary>
        /// Enum Delivered for value: delivered
        /// </summary>
        Delivered = 3
    }

    /// <summary>
    /// Converts <see cref="OuterEnumDefaultValue"/> to and from the JSON value
    /// </summary>
    public static class OuterEnumDefaultValueValueConverter
    {
        /// <summary>
        /// Parses a given value to <see cref="OuterEnumDefaultValue"/>
        /// </summary>
        /// <param name="value"></param>
        /// <returns></returns>
        public static OuterEnumDefaultValue FromString(string value)
        {
            if (value.Equals("placed"))
                return OuterEnumDefaultValue.Placed;

            if (value.Equals("approved"))
                return OuterEnumDefaultValue.Approved;

            if (value.Equals("delivered"))
                return OuterEnumDefaultValue.Delivered;

            throw new NotImplementedException($"Could not convert value to type OuterEnumDefaultValue: '{value}'");
        }

        /// <summary>
        /// Parses a given value to <see cref="OuterEnumDefaultValue"/>
        /// </summary>
        /// <param name="value"></param>
        /// <returns></returns>
        public static OuterEnumDefaultValue? FromStringOrDefault(string value)
        {
            if (value.Equals("placed"))
                return OuterEnumDefaultValue.Placed;

            if (value.Equals("approved"))
                return OuterEnumDefaultValue.Approved;

            if (value.Equals("delivered"))
                return OuterEnumDefaultValue.Delivered;

            return null;
        }

        /// <summary>
        /// Converts the <see cref="OuterEnumDefaultValue"/> to the json value
        /// </summary>
        /// <param name="value"></param>
        /// <returns></returns>
        /// <exception cref="NotImplementedException"></exception>
        public static string ToJsonValue(OuterEnumDefaultValue value)
        {
            if (value == OuterEnumDefaultValue.Placed)
                return "placed";

            if (value == OuterEnumDefaultValue.Approved)
                return "approved";

            if (value == OuterEnumDefaultValue.Delivered)
                return "delivered";

            throw new NotImplementedException($"Value could not be handled: '{value}'");
        }
    }

    /// <summary>
    /// A Json converter for type <see cref="OuterEnumDefaultValue"/>
    /// </summary>
    /// <exception cref="NotImplementedException"></exception>
    public class OuterEnumDefaultValueJsonConverter : JsonConverter<OuterEnumDefaultValue>
    {
        /// <summary>
        /// Returns a  from the Json object
        /// </summary>
        /// <param name="reader"></param>
        /// <param name="typeToConvert"></param>
        /// <param name="options"></param>
        /// <returns></returns>
        public override OuterEnumDefaultValue Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            string? rawValue = reader.GetString();

            OuterEnumDefaultValue? result = rawValue == null
                ? null
                : OuterEnumDefaultValueValueConverter.FromStringOrDefault(rawValue);

            if (result != null)
                return result.Value;

            throw new JsonException();
        }

        /// <summary>
        /// Writes the OuterEnumDefaultValue to the json writer
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="outerEnumDefaultValue"></param>
        /// <param name="options"></param>
        public override void Write(Utf8JsonWriter writer, OuterEnumDefaultValue outerEnumDefaultValue, JsonSerializerOptions options)
        {
            writer.WriteStringValue(outerEnumDefaultValue.ToString());
        }
    }

    /// <summary>
    /// A Json converter for type <see cref="OuterEnumDefaultValue"/>
    /// </summary>
    public class OuterEnumDefaultValueNullableJsonConverter : JsonConverter<OuterEnumDefaultValue?>
    {
        /// <summary>
        /// Returns a OuterEnumDefaultValue from the Json object
        /// </summary>
        /// <param name="reader"></param>
        /// <param name="typeToConvert"></param>
        /// <param name="options"></param>
        /// <returns></returns>
        public override OuterEnumDefaultValue? Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            string? rawValue = reader.GetString();

            OuterEnumDefaultValue? result = rawValue == null
                ? null
                : OuterEnumDefaultValueValueConverter.FromStringOrDefault(rawValue);

            if (result != null)
                return result.Value;

            throw new JsonException();
        }

        /// <summary>
        /// Writes the DateTime to the json writer
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="outerEnumDefaultValue"></param>
        /// <param name="options"></param>
        public override void Write(Utf8JsonWriter writer, OuterEnumDefaultValue? outerEnumDefaultValue, JsonSerializerOptions options)
        {
            writer.WriteStringValue(outerEnumDefaultValue?.ToString() ?? "null");
        }
    }


    /// <summary>
    /// The OuterEnumDefaultValueSerializationContext
    /// </summary>
    [JsonSourceGenerationOptions(WriteIndented = true, GenerationMode = JsonSourceGenerationMode.Metadata | JsonSourceGenerationMode.Serialization)]
    [JsonSerializable(typeof(OuterEnumDefaultValue))]
    public partial class OuterEnumDefaultValueSerializationContext : JsonSerializerContext { }
}
