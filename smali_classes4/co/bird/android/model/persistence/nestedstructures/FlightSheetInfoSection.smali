.class public final Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/model/persistence/nestedstructures/FlightSheetActionSection;
.implements Lco/bird/android/model/persistence/nestedstructures/FlightSheetBackground;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0086\u0008\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000f\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0003JS\u0010!\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00042\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\u0008\u0010$\u001a\u0004\u0018\u00010%H\u00d6\u0003J\t\u0010&\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\'\u001a\u00020\u0006H\u00d6\u0001R\u0018\u0010\u0008\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u001c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0016\u0010\u0003\u001a\u00020\u00048\u0016X\u0097\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0019\u00a8\u0006("
    }
    d2 = {
        "Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;",
        "Lco/bird/android/model/persistence/nestedstructures/FlightSheetActionSection;",
        "Lco/bird/android/model/persistence/nestedstructures/FlightSheetBackground;",
        "idx",
        "",
        "title",
        "",
        "subtitle",
        "action",
        "Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSectionAction;",
        "backgroundColor",
        "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;",
        "details",
        "",
        "Lco/bird/android/model/persistence/nestedstructures/FlightSheetDetail;",
        "(ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSectionAction;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/util/List;)V",
        "getAction",
        "()Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSectionAction;",
        "getBackgroundColor",
        "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;",
        "getDetails",
        "()Ljava/util/List;",
        "getIdx",
        "()I",
        "getSubtitle",
        "()Ljava/lang/String;",
        "getTitle",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "model-persistence_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final action:Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSectionAction;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "action"
    .end annotation

    .annotation runtime Lft5;
        value = "action"
    .end annotation
.end field

.field private final backgroundColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "background_color"
    .end annotation

    .annotation runtime Lft5;
        value = "background_color"
    .end annotation
.end field

.field private final details:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "details"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/FlightSheetDetail;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "details"
    .end annotation
.end field

.field private final idx:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "idx"
    .end annotation

    .annotation runtime Lft5;
        value = "idx"
    .end annotation
.end field

.field private final subtitle:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "subtitle"
    .end annotation

    .annotation runtime Lft5;
        value = "subtitle"
    .end annotation
.end field

.field private final title:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "title"
    .end annotation

    .annotation runtime Lft5;
        value = "title"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 9

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x3f

    const/4 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;-><init>(ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSectionAction;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSectionAction;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSectionAction;",
            "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/FlightSheetDetail;",
            ">;)V"
        }
    .end annotation

    const-string v0, "details"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->idx:I

    iput-object p2, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->title:Ljava/lang/String;

    iput-object p3, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->subtitle:Ljava/lang/String;

    iput-object p4, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->action:Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSectionAction;

    iput-object p5, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->backgroundColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    iput-object p6, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->details:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSectionAction;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    const p1, 0x7fffffff

    :cond_0
    and-int/lit8 p8, p7, 0x2

    const/4 v0, 0x0

    if-eqz p8, :cond_1

    move-object p8, v0

    goto :goto_0

    :cond_1
    move-object p8, p2

    :goto_0
    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    move-object v1, v0

    goto :goto_1

    :cond_2
    move-object v1, p3

    :goto_1
    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    move-object v2, v0

    goto :goto_2

    :cond_3
    move-object v2, p4

    :goto_2
    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    goto :goto_3

    :cond_4
    move-object v0, p5

    :goto_3
    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p6

    :cond_5
    move-object v3, p6

    move-object p2, p0

    move p3, p1

    move-object p4, p8

    move-object p5, v1

    move-object p6, v2

    move-object p7, v0

    move-object p8, v3

    invoke-direct/range {p2 .. p8}, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;-><init>(ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSectionAction;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSectionAction;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/util/List;ILjava/lang/Object;)Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget p1, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->idx:I

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->title:Ljava/lang/String;

    :cond_1
    move-object p8, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->subtitle:Ljava/lang/String;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->action:Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSectionAction;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->backgroundColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    :cond_4
    move-object v2, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    iget-object p6, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->details:Ljava/util/List;

    :cond_5
    move-object v3, p6

    move-object p2, p0

    move p3, p1

    move-object p4, p8

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    move-object p8, v3

    invoke-virtual/range {p2 .. p8}, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->copy(ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSectionAction;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/util/List;)Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->idx:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSectionAction;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->action:Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSectionAction;

    return-object v0
.end method

.method public final component5()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->backgroundColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/FlightSheetDetail;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->details:Ljava/util/List;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSectionAction;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/util/List;)Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSectionAction;",
            "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/FlightSheetDetail;",
            ">;)",
            "Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;"
        }
    .end annotation

    const-string v0, "details"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;

    move-object v1, v0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;-><init>(ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSectionAction;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;

    iget v1, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->idx:I

    iget v3, p1, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->idx:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->title:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->action:Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSectionAction;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->action:Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSectionAction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->backgroundColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->backgroundColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->details:Ljava/util/List;

    iget-object p1, p1, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->details:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public getAction()Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSectionAction;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->action:Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSectionAction;

    return-object v0
.end method

.method public getBackgroundColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->backgroundColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    return-object v0
.end method

.method public final getDetails()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/FlightSheetDetail;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->details:Ljava/util/List;

    return-object v0
.end method

.method public getIdx()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->idx:I

    return v0
.end method

.method public getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->idx:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->title:Ljava/lang/String;

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

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->subtitle:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->action:Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSectionAction;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->backgroundColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->details:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget v0, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->idx:I

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->title:Ljava/lang/String;

    iget-object v2, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->subtitle:Ljava/lang/String;

    iget-object v3, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->action:Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSectionAction;

    iget-object v4, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->backgroundColor:Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    iget-object v5, p0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;->details:Ljava/util/List;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "FlightSheetInfoSection(idx="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", subtitle="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", action="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", backgroundColor="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", details="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
