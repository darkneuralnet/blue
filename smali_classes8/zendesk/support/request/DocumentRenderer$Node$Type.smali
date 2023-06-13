.class final enum Lzendesk/support/request/DocumentRenderer$Node$Type;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/support/request/DocumentRenderer$Node;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Type"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lzendesk/support/request/DocumentRenderer$Node$Type;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lzendesk/support/request/DocumentRenderer$Node$Type;

.field public static final enum A:Lzendesk/support/request/DocumentRenderer$Node$Type;

.field public static final enum B:Lzendesk/support/request/DocumentRenderer$Node$Type;

.field public static final enum Br:Lzendesk/support/request/DocumentRenderer$Node$Type;

.field public static final enum Code:Lzendesk/support/request/DocumentRenderer$Node$Type;

.field public static final enum Div:Lzendesk/support/request/DocumentRenderer$Node$Type;

.field public static final enum Document:Lzendesk/support/request/DocumentRenderer$Node$Type;

.field public static final enum Em:Lzendesk/support/request/DocumentRenderer$Node$Type;

.field public static final enum H1:Lzendesk/support/request/DocumentRenderer$Node$Type;

.field public static final enum H2:Lzendesk/support/request/DocumentRenderer$Node$Type;

.field public static final enum H3:Lzendesk/support/request/DocumentRenderer$Node$Type;

.field public static final enum H4:Lzendesk/support/request/DocumentRenderer$Node$Type;

.field public static final enum H5:Lzendesk/support/request/DocumentRenderer$Node$Type;

.field public static final enum H6:Lzendesk/support/request/DocumentRenderer$Node$Type;

.field public static final enum Hr:Lzendesk/support/request/DocumentRenderer$Node$Type;

.field public static final enum I:Lzendesk/support/request/DocumentRenderer$Node$Type;

.field public static final enum Img:Lzendesk/support/request/DocumentRenderer$Node$Type;

.field public static final enum Li:Lzendesk/support/request/DocumentRenderer$Node$Type;

.field public static final enum Ol:Lzendesk/support/request/DocumentRenderer$Node$Type;

.field public static final enum P:Lzendesk/support/request/DocumentRenderer$Node$Type;

.field public static final enum Quote:Lzendesk/support/request/DocumentRenderer$Node$Type;

.field public static final enum Strong:Lzendesk/support/request/DocumentRenderer$Node$Type;

.field public static final enum Text:Lzendesk/support/request/DocumentRenderer$Node$Type;

.field public static final enum U:Lzendesk/support/request/DocumentRenderer$Node$Type;

.field public static final enum Ul:Lzendesk/support/request/DocumentRenderer$Node$Type;

.field public static final enum Unknown:Lzendesk/support/request/DocumentRenderer$Node$Type;


# instance fields
.field private final tag:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 28

    new-instance v0, Lzendesk/support/request/DocumentRenderer$Node$Type;

    const-string v1, "b"

    const-string v2, "B"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lzendesk/support/request/DocumentRenderer$Node$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lzendesk/support/request/DocumentRenderer$Node$Type;->B:Lzendesk/support/request/DocumentRenderer$Node$Type;

    new-instance v1, Lzendesk/support/request/DocumentRenderer$Node$Type;

    const-string v2, "i"

    const-string v4, "I"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, Lzendesk/support/request/DocumentRenderer$Node$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lzendesk/support/request/DocumentRenderer$Node$Type;->I:Lzendesk/support/request/DocumentRenderer$Node$Type;

    new-instance v2, Lzendesk/support/request/DocumentRenderer$Node$Type;

    const-string v4, "code"

    const-string v6, "Code"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, Lzendesk/support/request/DocumentRenderer$Node$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lzendesk/support/request/DocumentRenderer$Node$Type;->Code:Lzendesk/support/request/DocumentRenderer$Node$Type;

    new-instance v4, Lzendesk/support/request/DocumentRenderer$Node$Type;

    const-string v6, "h1"

    const-string v8, "H1"

    const/4 v9, 0x3

    invoke-direct {v4, v8, v9, v6}, Lzendesk/support/request/DocumentRenderer$Node$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lzendesk/support/request/DocumentRenderer$Node$Type;->H1:Lzendesk/support/request/DocumentRenderer$Node$Type;

    new-instance v6, Lzendesk/support/request/DocumentRenderer$Node$Type;

    const-string v8, "h2"

    const-string v10, "H2"

    const/4 v11, 0x4

    invoke-direct {v6, v10, v11, v8}, Lzendesk/support/request/DocumentRenderer$Node$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, Lzendesk/support/request/DocumentRenderer$Node$Type;->H2:Lzendesk/support/request/DocumentRenderer$Node$Type;

    new-instance v8, Lzendesk/support/request/DocumentRenderer$Node$Type;

    const-string v10, "h3"

    const-string v12, "H3"

    const/4 v13, 0x5

    invoke-direct {v8, v12, v13, v10}, Lzendesk/support/request/DocumentRenderer$Node$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v8, Lzendesk/support/request/DocumentRenderer$Node$Type;->H3:Lzendesk/support/request/DocumentRenderer$Node$Type;

    new-instance v10, Lzendesk/support/request/DocumentRenderer$Node$Type;

    const-string v12, "h4"

    const-string v14, "H4"

    const/4 v15, 0x6

    invoke-direct {v10, v14, v15, v12}, Lzendesk/support/request/DocumentRenderer$Node$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v10, Lzendesk/support/request/DocumentRenderer$Node$Type;->H4:Lzendesk/support/request/DocumentRenderer$Node$Type;

    new-instance v12, Lzendesk/support/request/DocumentRenderer$Node$Type;

    const-string v14, "h5"

    const-string v15, "H5"

    const/4 v13, 0x7

    invoke-direct {v12, v15, v13, v14}, Lzendesk/support/request/DocumentRenderer$Node$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v12, Lzendesk/support/request/DocumentRenderer$Node$Type;->H5:Lzendesk/support/request/DocumentRenderer$Node$Type;

    new-instance v14, Lzendesk/support/request/DocumentRenderer$Node$Type;

    const-string v15, "h6"

    const-string v13, "H6"

    const/16 v11, 0x8

    invoke-direct {v14, v13, v11, v15}, Lzendesk/support/request/DocumentRenderer$Node$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v14, Lzendesk/support/request/DocumentRenderer$Node$Type;->H6:Lzendesk/support/request/DocumentRenderer$Node$Type;

    new-instance v13, Lzendesk/support/request/DocumentRenderer$Node$Type;

    const-string v15, "strong"

    const-string v11, "Strong"

    const/16 v9, 0x9

    invoke-direct {v13, v11, v9, v15}, Lzendesk/support/request/DocumentRenderer$Node$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v13, Lzendesk/support/request/DocumentRenderer$Node$Type;->Strong:Lzendesk/support/request/DocumentRenderer$Node$Type;

    new-instance v11, Lzendesk/support/request/DocumentRenderer$Node$Type;

    const-string v15, "u"

    const-string v9, "U"

    const/16 v7, 0xa

    invoke-direct {v11, v9, v7, v15}, Lzendesk/support/request/DocumentRenderer$Node$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v11, Lzendesk/support/request/DocumentRenderer$Node$Type;->U:Lzendesk/support/request/DocumentRenderer$Node$Type;

    new-instance v9, Lzendesk/support/request/DocumentRenderer$Node$Type;

    const-string v15, "em"

    const-string v7, "Em"

    const/16 v5, 0xb

    invoke-direct {v9, v7, v5, v15}, Lzendesk/support/request/DocumentRenderer$Node$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v9, Lzendesk/support/request/DocumentRenderer$Node$Type;->Em:Lzendesk/support/request/DocumentRenderer$Node$Type;

    new-instance v7, Lzendesk/support/request/DocumentRenderer$Node$Type;

    const-string v15, "br"

    const-string v5, "Br"

    const/16 v3, 0xc

    invoke-direct {v7, v5, v3, v15}, Lzendesk/support/request/DocumentRenderer$Node$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v7, Lzendesk/support/request/DocumentRenderer$Node$Type;->Br:Lzendesk/support/request/DocumentRenderer$Node$Type;

    new-instance v5, Lzendesk/support/request/DocumentRenderer$Node$Type;

    const-string v15, "hr"

    const-string v3, "Hr"

    move-object/from16 v16, v7

    const/16 v7, 0xd

    invoke-direct {v5, v3, v7, v15}, Lzendesk/support/request/DocumentRenderer$Node$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lzendesk/support/request/DocumentRenderer$Node$Type;->Hr:Lzendesk/support/request/DocumentRenderer$Node$Type;

    new-instance v3, Lzendesk/support/request/DocumentRenderer$Node$Type;

    const-string v15, "div"

    const-string v7, "Div"

    move-object/from16 v17, v5

    const/16 v5, 0xe

    invoke-direct {v3, v7, v5, v15}, Lzendesk/support/request/DocumentRenderer$Node$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lzendesk/support/request/DocumentRenderer$Node$Type;->Div:Lzendesk/support/request/DocumentRenderer$Node$Type;

    new-instance v7, Lzendesk/support/request/DocumentRenderer$Node$Type;

    const-string v15, "p"

    const-string v5, "P"

    move-object/from16 v18, v3

    const/16 v3, 0xf

    invoke-direct {v7, v5, v3, v15}, Lzendesk/support/request/DocumentRenderer$Node$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v7, Lzendesk/support/request/DocumentRenderer$Node$Type;->P:Lzendesk/support/request/DocumentRenderer$Node$Type;

    new-instance v5, Lzendesk/support/request/DocumentRenderer$Node$Type;

    const-string v15, "li"

    const-string v3, "Li"

    move-object/from16 v19, v7

    const/16 v7, 0x10

    invoke-direct {v5, v3, v7, v15}, Lzendesk/support/request/DocumentRenderer$Node$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lzendesk/support/request/DocumentRenderer$Node$Type;->Li:Lzendesk/support/request/DocumentRenderer$Node$Type;

    new-instance v3, Lzendesk/support/request/DocumentRenderer$Node$Type;

    const-string v15, "a"

    const-string v7, "A"

    move-object/from16 v20, v5

    const/16 v5, 0x11

    invoke-direct {v3, v7, v5, v15}, Lzendesk/support/request/DocumentRenderer$Node$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lzendesk/support/request/DocumentRenderer$Node$Type;->A:Lzendesk/support/request/DocumentRenderer$Node$Type;

    new-instance v7, Lzendesk/support/request/DocumentRenderer$Node$Type;

    const-string v15, "ol"

    const-string v5, "Ol"

    move-object/from16 v21, v3

    const/16 v3, 0x12

    invoke-direct {v7, v5, v3, v15}, Lzendesk/support/request/DocumentRenderer$Node$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v7, Lzendesk/support/request/DocumentRenderer$Node$Type;->Ol:Lzendesk/support/request/DocumentRenderer$Node$Type;

    new-instance v5, Lzendesk/support/request/DocumentRenderer$Node$Type;

    const-string v15, "ul"

    const-string v3, "Ul"

    move-object/from16 v22, v7

    const/16 v7, 0x13

    invoke-direct {v5, v3, v7, v15}, Lzendesk/support/request/DocumentRenderer$Node$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lzendesk/support/request/DocumentRenderer$Node$Type;->Ul:Lzendesk/support/request/DocumentRenderer$Node$Type;

    new-instance v3, Lzendesk/support/request/DocumentRenderer$Node$Type;

    const-string v15, "img"

    const-string v7, "Img"

    move-object/from16 v23, v5

    const/16 v5, 0x14

    invoke-direct {v3, v7, v5, v15}, Lzendesk/support/request/DocumentRenderer$Node$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lzendesk/support/request/DocumentRenderer$Node$Type;->Img:Lzendesk/support/request/DocumentRenderer$Node$Type;

    new-instance v7, Lzendesk/support/request/DocumentRenderer$Node$Type;

    const-string v15, "blockquote"

    const-string v5, "Quote"

    move-object/from16 v24, v3

    const/16 v3, 0x15

    invoke-direct {v7, v5, v3, v15}, Lzendesk/support/request/DocumentRenderer$Node$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v7, Lzendesk/support/request/DocumentRenderer$Node$Type;->Quote:Lzendesk/support/request/DocumentRenderer$Node$Type;

    new-instance v5, Lzendesk/support/request/DocumentRenderer$Node$Type;

    const/16 v15, 0x16

    const-string v3, "$text"

    move-object/from16 v25, v7

    const-string v7, "Text"

    invoke-direct {v5, v7, v15, v3}, Lzendesk/support/request/DocumentRenderer$Node$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lzendesk/support/request/DocumentRenderer$Node$Type;->Text:Lzendesk/support/request/DocumentRenderer$Node$Type;

    new-instance v3, Lzendesk/support/request/DocumentRenderer$Node$Type;

    const/16 v7, 0x17

    const-string v15, "$document"

    move-object/from16 v26, v5

    const-string v5, "Document"

    invoke-direct {v3, v5, v7, v15}, Lzendesk/support/request/DocumentRenderer$Node$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lzendesk/support/request/DocumentRenderer$Node$Type;->Document:Lzendesk/support/request/DocumentRenderer$Node$Type;

    new-instance v5, Lzendesk/support/request/DocumentRenderer$Node$Type;

    const/16 v7, 0x18

    const-string v15, "$unknown"

    move-object/from16 v27, v3

    const-string v3, "Unknown"

    invoke-direct {v5, v3, v7, v15}, Lzendesk/support/request/DocumentRenderer$Node$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lzendesk/support/request/DocumentRenderer$Node$Type;->Unknown:Lzendesk/support/request/DocumentRenderer$Node$Type;

    const/16 v3, 0x19

    new-array v3, v3, [Lzendesk/support/request/DocumentRenderer$Node$Type;

    const/4 v7, 0x0

    aput-object v0, v3, v7

    const/4 v0, 0x1

    aput-object v1, v3, v0

    const/4 v0, 0x2

    aput-object v2, v3, v0

    const/4 v0, 0x3

    aput-object v4, v3, v0

    const/4 v0, 0x4

    aput-object v6, v3, v0

    const/4 v0, 0x5

    aput-object v8, v3, v0

    const/4 v0, 0x6

    aput-object v10, v3, v0

    const/4 v0, 0x7

    aput-object v12, v3, v0

    const/16 v0, 0x8

    aput-object v14, v3, v0

    const/16 v0, 0x9

    aput-object v13, v3, v0

    const/16 v0, 0xa

    aput-object v11, v3, v0

    const/16 v0, 0xb

    aput-object v9, v3, v0

    const/16 v0, 0xc

    aput-object v16, v3, v0

    const/16 v0, 0xd

    aput-object v17, v3, v0

    const/16 v0, 0xe

    aput-object v18, v3, v0

    const/16 v0, 0xf

    aput-object v19, v3, v0

    const/16 v0, 0x10

    aput-object v20, v3, v0

    const/16 v0, 0x11

    aput-object v21, v3, v0

    const/16 v0, 0x12

    aput-object v22, v3, v0

    const/16 v0, 0x13

    aput-object v23, v3, v0

    const/16 v0, 0x14

    aput-object v24, v3, v0

    const/16 v0, 0x15

    aput-object v25, v3, v0

    const/16 v0, 0x16

    aput-object v26, v3, v0

    const/16 v0, 0x17

    aput-object v27, v3, v0

    const/16 v0, 0x18

    aput-object v5, v3, v0

    sput-object v3, Lzendesk/support/request/DocumentRenderer$Node$Type;->$VALUES:[Lzendesk/support/request/DocumentRenderer$Node$Type;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lzendesk/support/request/DocumentRenderer$Node$Type;->tag:Ljava/lang/String;

    return-void
.end method

.method public static forTag(Ljava/lang/String;)Lzendesk/support/request/DocumentRenderer$Node$Type;
    .locals 5

    invoke-static {}, Lzendesk/support/request/DocumentRenderer$Node$Type;->values()[Lzendesk/support/request/DocumentRenderer$Node$Type;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lzendesk/support/request/DocumentRenderer$Node$Type;->getTag()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    sget-object p0, Lzendesk/support/request/DocumentRenderer$Node$Type;->Unknown:Lzendesk/support/request/DocumentRenderer$Node$Type;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lzendesk/support/request/DocumentRenderer$Node$Type;
    .locals 1

    const-class v0, Lzendesk/support/request/DocumentRenderer$Node$Type;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lzendesk/support/request/DocumentRenderer$Node$Type;

    return-object p0
.end method

.method public static values()[Lzendesk/support/request/DocumentRenderer$Node$Type;
    .locals 1

    sget-object v0, Lzendesk/support/request/DocumentRenderer$Node$Type;->$VALUES:[Lzendesk/support/request/DocumentRenderer$Node$Type;

    invoke-virtual {v0}, [Lzendesk/support/request/DocumentRenderer$Node$Type;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lzendesk/support/request/DocumentRenderer$Node$Type;

    return-object v0
.end method


# virtual methods
.method public getTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzendesk/support/request/DocumentRenderer$Node$Type;->tag:Ljava/lang/String;

    return-object v0
.end method
