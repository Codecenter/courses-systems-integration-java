<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
	
	<xsl:template match="Order">
		<Invoice>
			<Recipient>
				<Name><xsl:value-of select="Customer/Name" /></Name>
			</Recipient>
			<xsl:apply-templates select="Products/Product" />
		</Invoice>
	</xsl:template>

	<xsl:template match="Product">
		<InvoiceLine>
			<ArticleCode>
				<xsl:value-of select="@article" />
			</ArticleCode>
			<Message>
				<xsl:value-of select="@title" />
			</Message>
			<Quantity>
				<xsl:value-of select="@quantity" />
			</Quantity>
			<UnitPrice unit="pcs">
				<xsl:value-of select="@unitPrice" />
			</UnitPrice>
			<TotalPrice>
				<xsl:value-of select="@unitPrice * @quantity" />
			</TotalPrice>
		</InvoiceLine>
	</xsl:template>
</xsl:stylesheet>