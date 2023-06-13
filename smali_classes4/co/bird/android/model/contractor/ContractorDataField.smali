.class public final Lco/bird/android/model/contractor/ContractorDataField;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0008\u001e\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001Bo\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u000e\u0008\u0002\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0012\u00a2\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0012H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0006H\u00c6\u0003J\t\u0010)\u001a\u00020\u0008H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\t\u0010-\u001a\u00020\u000eH\u00c6\u0003J\t\u0010.\u001a\u00020\u0010H\u00c6\u0003Jy\u0010/\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u000e\u0008\u0002\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0012H\u00c6\u0001J\t\u00100\u001a\u000201H\u00d6\u0001J\u0013\u00102\u001a\u00020\u00102\u0008\u00103\u001a\u0004\u0018\u000104H\u00d6\u0003J\t\u00105\u001a\u000201H\u00d6\u0001J\t\u00106\u001a\u00020\u0003H\u00d6\u0001J\u0019\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u000201H\u00d6\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u001c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00128\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$\u00a8\u0006<"
    }
    d2 = {
        "Lco/bird/android/model/contractor/ContractorDataField;",
        "Landroid/os/Parcelable;",
        "id",
        "",
        "key",
        "kind",
        "Lco/bird/android/model/contractor/ContractorDataFieldKind;",
        "format",
        "Lco/bird/android/model/contractor/ContractorDataFieldFormat;",
        "displayName",
        "defaultValue",
        "subFieldCardinality",
        "Lco/bird/android/model/contractor/DataFieldSubFieldCardinality;",
        "params",
        "Lco/bird/android/model/contractor/ContractorDataFieldParams;",
        "stored",
        "",
        "subFields",
        "",
        "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/contractor/ContractorDataFieldKind;Lco/bird/android/model/contractor/ContractorDataFieldFormat;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/contractor/DataFieldSubFieldCardinality;Lco/bird/android/model/contractor/ContractorDataFieldParams;ZLjava/util/List;)V",
        "getDefaultValue",
        "()Ljava/lang/String;",
        "getDisplayName",
        "getFormat",
        "()Lco/bird/android/model/contractor/ContractorDataFieldFormat;",
        "getId",
        "getKey",
        "getKind",
        "()Lco/bird/android/model/contractor/ContractorDataFieldKind;",
        "getParams",
        "()Lco/bird/android/model/contractor/ContractorDataFieldParams;",
        "getStored",
        "()Z",
        "getSubFieldCardinality",
        "()Lco/bird/android/model/contractor/DataFieldSubFieldCardinality;",
        "getSubFields",
        "()Ljava/util/List;",
        "component1",
        "component10",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "describeContents",
        "",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "model_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lco/bird/android/model/contractor/ContractorDataField;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final defaultValue:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "default_value"
    .end annotation

    .annotation runtime Lft5;
        value = "default_value"
    .end annotation
.end field

.field private final displayName:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "display_name"
    .end annotation

    .annotation runtime Lft5;
        value = "display_name"
    .end annotation
.end field

.field private final format:Lco/bird/android/model/contractor/ContractorDataFieldFormat;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "format"
    .end annotation

    .annotation runtime Lft5;
        value = "format"
    .end annotation
.end field

.field private final id:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "id"
    .end annotation

    .annotation runtime Lft5;
        value = "id"
    .end annotation
.end field

.field private final key:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "key"
    .end annotation

    .annotation runtime Lft5;
        value = "key"
    .end annotation
.end field

.field private final kind:Lco/bird/android/model/contractor/ContractorDataFieldKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "kind"
    .end annotation

    .annotation runtime Lft5;
        value = "kind"
    .end annotation
.end field

.field private final params:Lco/bird/android/model/contractor/ContractorDataFieldParams;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "params"
    .end annotation

    .annotation runtime Lft5;
        value = "params"
    .end annotation
.end field

.field private final stored:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "stored"
    .end annotation

    .annotation runtime Lft5;
        value = "stored"
    .end annotation
.end field

.field private final subFieldCardinality:Lco/bird/android/model/contractor/DataFieldSubFieldCardinality;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "sub_field_cardinality"
    .end annotation

    .annotation runtime Lft5;
        value = "sub_field_cardinality"
    .end annotation
.end field

.field private final subFields:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "sub_fields"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "sub_fields"
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/model/contractor/ContractorDataField$Creator;

    invoke-direct {v0}, Lco/bird/android/model/contractor/ContractorDataField$Creator;-><init>()V

    sput-object v0, Lco/bird/android/model/contractor/ContractorDataField;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/contractor/ContractorDataFieldKind;Lco/bird/android/model/contractor/ContractorDataFieldFormat;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/contractor/DataFieldSubFieldCardinality;Lco/bird/android/model/contractor/ContractorDataFieldParams;ZLjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/contractor/ContractorDataFieldKind;",
            "Lco/bird/android/model/contractor/ContractorDataFieldFormat;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/contractor/DataFieldSubFieldCardinality;",
            "Lco/bird/android/model/contractor/ContractorDataFieldParams;",
            "Z",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "format"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subFields"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/contractor/ContractorDataField;->id:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/android/model/contractor/ContractorDataField;->key:Ljava/lang/String;

    iput-object p3, p0, Lco/bird/android/model/contractor/ContractorDataField;->kind:Lco/bird/android/model/contractor/ContractorDataFieldKind;

    iput-object p4, p0, Lco/bird/android/model/contractor/ContractorDataField;->format:Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    iput-object p5, p0, Lco/bird/android/model/contractor/ContractorDataField;->displayName:Ljava/lang/String;

    iput-object p6, p0, Lco/bird/android/model/contractor/ContractorDataField;->defaultValue:Ljava/lang/String;

    iput-object p7, p0, Lco/bird/android/model/contractor/ContractorDataField;->subFieldCardinality:Lco/bird/android/model/contractor/DataFieldSubFieldCardinality;

    iput-object p8, p0, Lco/bird/android/model/contractor/ContractorDataField;->params:Lco/bird/android/model/contractor/ContractorDataFieldParams;

    iput-boolean p9, p0, Lco/bird/android/model/contractor/ContractorDataField;->stored:Z

    iput-object p10, p0, Lco/bird/android/model/contractor/ContractorDataField;->subFields:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/contractor/ContractorDataFieldKind;Lco/bird/android/model/contractor/ContractorDataFieldFormat;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/contractor/DataFieldSubFieldCardinality;Lco/bird/android/model/contractor/ContractorDataFieldParams;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 14

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x1

    const-string v2, ""

    if-eqz v1, :cond_0

    move-object v4, v2

    goto :goto_0

    :cond_0
    move-object v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    move-object v5, v2

    goto :goto_1

    :cond_1
    move-object/from16 v5, p2

    :goto_1
    and-int/lit8 v1, v0, 0x10

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move-object v8, v2

    goto :goto_2

    :cond_2
    move-object/from16 v8, p5

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    move-object v9, v2

    goto :goto_3

    :cond_3
    move-object/from16 v9, p6

    :goto_3
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_4

    move-object v10, v2

    goto :goto_4

    :cond_4
    move-object/from16 v10, p7

    :goto_4
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_5

    const/4 v1, 0x0

    move v12, v1

    goto :goto_5

    :cond_5
    move/from16 v12, p9

    :goto_5
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_6

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    move-object v13, v0

    goto :goto_6

    :cond_6
    move-object/from16 v13, p10

    :goto_6
    move-object v3, p0

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v11, p8

    invoke-direct/range {v3 .. v13}, Lco/bird/android/model/contractor/ContractorDataField;-><init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/contractor/ContractorDataFieldKind;Lco/bird/android/model/contractor/ContractorDataFieldFormat;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/contractor/DataFieldSubFieldCardinality;Lco/bird/android/model/contractor/ContractorDataFieldParams;ZLjava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/contractor/ContractorDataField;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/contractor/ContractorDataFieldKind;Lco/bird/android/model/contractor/ContractorDataFieldFormat;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/contractor/DataFieldSubFieldCardinality;Lco/bird/android/model/contractor/ContractorDataFieldParams;ZLjava/util/List;ILjava/lang/Object;)Lco/bird/android/model/contractor/ContractorDataField;
    .locals 11

    move-object v0, p0

    move/from16 v1, p11

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/android/model/contractor/ContractorDataField;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/bird/android/model/contractor/ContractorDataField;->key:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lco/bird/android/model/contractor/ContractorDataField;->kind:Lco/bird/android/model/contractor/ContractorDataFieldKind;

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lco/bird/android/model/contractor/ContractorDataField;->format:Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    goto :goto_3

    :cond_3
    move-object v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lco/bird/android/model/contractor/ContractorDataField;->displayName:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lco/bird/android/model/contractor/ContractorDataField;->defaultValue:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lco/bird/android/model/contractor/ContractorDataField;->subFieldCardinality:Lco/bird/android/model/contractor/DataFieldSubFieldCardinality;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lco/bird/android/model/contractor/ContractorDataField;->params:Lco/bird/android/model/contractor/ContractorDataFieldParams;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-boolean v10, v0, Lco/bird/android/model/contractor/ContractorDataField;->stored:Z

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v1, v1, 0x200

    if-eqz v1, :cond_9

    iget-object v1, v0, Lco/bird/android/model/contractor/ContractorDataField;->subFields:Ljava/util/List;

    goto :goto_9

    :cond_9
    move-object/from16 v1, p10

    :goto_9
    move-object p1, v2

    move-object p2, v3

    move-object p3, v4

    move-object p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move/from16 p9, v10

    move-object/from16 p10, v1

    invoke-virtual/range {p0 .. p10}, Lco/bird/android/model/contractor/ContractorDataField;->copy(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/contractor/ContractorDataFieldKind;Lco/bird/android/model/contractor/ContractorDataFieldFormat;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/contractor/DataFieldSubFieldCardinality;Lco/bird/android/model/contractor/ContractorDataFieldParams;ZLjava/util/List;)Lco/bird/android/model/contractor/ContractorDataField;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/contractor/ContractorDataField;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/contractor/ContractorDataField;->subFields:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/contractor/ContractorDataField;->key:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/contractor/ContractorDataFieldKind;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/contractor/ContractorDataField;->kind:Lco/bird/android/model/contractor/ContractorDataFieldKind;

    return-object v0
.end method

.method public final component4()Lco/bird/android/model/contractor/ContractorDataFieldFormat;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/contractor/ContractorDataField;->format:Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/contractor/ContractorDataField;->displayName:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/contractor/ContractorDataField;->defaultValue:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lco/bird/android/model/contractor/DataFieldSubFieldCardinality;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/contractor/ContractorDataField;->subFieldCardinality:Lco/bird/android/model/contractor/DataFieldSubFieldCardinality;

    return-object v0
.end method

.method public final component8()Lco/bird/android/model/contractor/ContractorDataFieldParams;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/contractor/ContractorDataField;->params:Lco/bird/android/model/contractor/ContractorDataFieldParams;

    return-object v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/contractor/ContractorDataField;->stored:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/contractor/ContractorDataFieldKind;Lco/bird/android/model/contractor/ContractorDataFieldFormat;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/contractor/DataFieldSubFieldCardinality;Lco/bird/android/model/contractor/ContractorDataFieldParams;ZLjava/util/List;)Lco/bird/android/model/contractor/ContractorDataField;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/contractor/ContractorDataFieldKind;",
            "Lco/bird/android/model/contractor/ContractorDataFieldFormat;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/contractor/DataFieldSubFieldCardinality;",
            "Lco/bird/android/model/contractor/ContractorDataFieldParams;",
            "Z",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lco/bird/android/model/contractor/ContractorDataField;"
        }
    .end annotation

    const-string v0, "id"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    move-object v4, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "format"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subFields"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/contractor/ContractorDataField;

    move-object v1, v0

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v10, p9

    invoke-direct/range {v1 .. v11}, Lco/bird/android/model/contractor/ContractorDataField;-><init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/contractor/ContractorDataFieldKind;Lco/bird/android/model/contractor/ContractorDataFieldFormat;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/contractor/DataFieldSubFieldCardinality;Lco/bird/android/model/contractor/ContractorDataFieldParams;ZLjava/util/List;)V

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/contractor/ContractorDataField;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/contractor/ContractorDataField;

    iget-object v1, p0, Lco/bird/android/model/contractor/ContractorDataField;->id:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/contractor/ContractorDataField;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/contractor/ContractorDataField;->key:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/contractor/ContractorDataField;->key:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/contractor/ContractorDataField;->kind:Lco/bird/android/model/contractor/ContractorDataFieldKind;

    iget-object v3, p1, Lco/bird/android/model/contractor/ContractorDataField;->kind:Lco/bird/android/model/contractor/ContractorDataFieldKind;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/contractor/ContractorDataField;->format:Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    iget-object v3, p1, Lco/bird/android/model/contractor/ContractorDataField;->format:Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/contractor/ContractorDataField;->displayName:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/contractor/ContractorDataField;->displayName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/android/model/contractor/ContractorDataField;->defaultValue:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/contractor/ContractorDataField;->defaultValue:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/contractor/ContractorDataField;->subFieldCardinality:Lco/bird/android/model/contractor/DataFieldSubFieldCardinality;

    iget-object v3, p1, Lco/bird/android/model/contractor/ContractorDataField;->subFieldCardinality:Lco/bird/android/model/contractor/DataFieldSubFieldCardinality;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/android/model/contractor/ContractorDataField;->params:Lco/bird/android/model/contractor/ContractorDataFieldParams;

    iget-object v3, p1, Lco/bird/android/model/contractor/ContractorDataField;->params:Lco/bird/android/model/contractor/ContractorDataFieldParams;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lco/bird/android/model/contractor/ContractorDataField;->stored:Z

    iget-boolean v3, p1, Lco/bird/android/model/contractor/ContractorDataField;->stored:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lco/bird/android/model/contractor/ContractorDataField;->subFields:Ljava/util/List;

    iget-object p1, p1, Lco/bird/android/model/contractor/ContractorDataField;->subFields:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getDefaultValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/contractor/ContractorDataField;->defaultValue:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisplayName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/contractor/ContractorDataField;->displayName:Ljava/lang/String;

    return-object v0
.end method

.method public final getFormat()Lco/bird/android/model/contractor/ContractorDataFieldFormat;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/contractor/ContractorDataField;->format:Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/contractor/ContractorDataField;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/contractor/ContractorDataField;->key:Ljava/lang/String;

    return-object v0
.end method

.method public final getKind()Lco/bird/android/model/contractor/ContractorDataFieldKind;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/contractor/ContractorDataField;->kind:Lco/bird/android/model/contractor/ContractorDataFieldKind;

    return-object v0
.end method

.method public final getParams()Lco/bird/android/model/contractor/ContractorDataFieldParams;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/contractor/ContractorDataField;->params:Lco/bird/android/model/contractor/ContractorDataFieldParams;

    return-object v0
.end method

.method public final getStored()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/contractor/ContractorDataField;->stored:Z

    return v0
.end method

.method public final getSubFieldCardinality()Lco/bird/android/model/contractor/DataFieldSubFieldCardinality;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/contractor/ContractorDataField;->subFieldCardinality:Lco/bird/android/model/contractor/DataFieldSubFieldCardinality;

    return-object v0
.end method

.method public final getSubFields()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/contractor/ContractorDataField;->subFields:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/contractor/ContractorDataField;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/contractor/ContractorDataField;->key:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/contractor/ContractorDataField;->kind:Lco/bird/android/model/contractor/ContractorDataFieldKind;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/contractor/ContractorDataField;->format:Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/contractor/ContractorDataField;->displayName:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/contractor/ContractorDataField;->defaultValue:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/contractor/ContractorDataField;->subFieldCardinality:Lco/bird/android/model/contractor/DataFieldSubFieldCardinality;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/contractor/ContractorDataField;->params:Lco/bird/android/model/contractor/ContractorDataFieldParams;

    invoke-virtual {v1}, Lco/bird/android/model/contractor/ContractorDataFieldParams;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/contractor/ContractorDataField;->stored:Z

    if-eqz v1, :cond_3

    const/4 v1, 0x1

    :cond_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/contractor/ContractorDataField;->subFields:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lco/bird/android/model/contractor/ContractorDataField;->id:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/android/model/contractor/ContractorDataField;->key:Ljava/lang/String;

    iget-object v2, p0, Lco/bird/android/model/contractor/ContractorDataField;->kind:Lco/bird/android/model/contractor/ContractorDataFieldKind;

    iget-object v3, p0, Lco/bird/android/model/contractor/ContractorDataField;->format:Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    iget-object v4, p0, Lco/bird/android/model/contractor/ContractorDataField;->displayName:Ljava/lang/String;

    iget-object v5, p0, Lco/bird/android/model/contractor/ContractorDataField;->defaultValue:Ljava/lang/String;

    iget-object v6, p0, Lco/bird/android/model/contractor/ContractorDataField;->subFieldCardinality:Lco/bird/android/model/contractor/DataFieldSubFieldCardinality;

    iget-object v7, p0, Lco/bird/android/model/contractor/ContractorDataField;->params:Lco/bird/android/model/contractor/ContractorDataFieldParams;

    iget-boolean v8, p0, Lco/bird/android/model/contractor/ContractorDataField;->stored:Z

    iget-object v9, p0, Lco/bird/android/model/contractor/ContractorDataField;->subFields:Ljava/util/List;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "ContractorDataField(id="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", key="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", kind="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", format="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", displayName="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", defaultValue="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", subFieldCardinality="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", params="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", stored="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", subFields="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/contractor/ContractorDataField;->id:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/contractor/ContractorDataField;->key:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/contractor/ContractorDataField;->kind:Lco/bird/android/model/contractor/ContractorDataFieldKind;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/contractor/ContractorDataField;->format:Lco/bird/android/model/contractor/ContractorDataFieldFormat;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/contractor/ContractorDataField;->displayName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/contractor/ContractorDataField;->defaultValue:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/contractor/ContractorDataField;->subFieldCardinality:Lco/bird/android/model/contractor/DataFieldSubFieldCardinality;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lco/bird/android/model/contractor/ContractorDataField;->params:Lco/bird/android/model/contractor/ContractorDataFieldParams;

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/contractor/ContractorDataFieldParams;->writeToParcel(Landroid/os/Parcel;I)V

    iget-boolean p2, p0, Lco/bird/android/model/contractor/ContractorDataField;->stored:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lco/bird/android/model/contractor/ContractorDataField;->subFields:Ljava/util/List;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    return-void
.end method
