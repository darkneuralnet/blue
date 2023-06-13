.class public final Lcom/stripe/android/ui/core/elements/SharedDataSpec;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LWs5;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/ui/core/elements/SharedDataSpec$$serializer;,
        Lcom/stripe/android/ui/core/elements/SharedDataSpec$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u001b\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0081\u0008\u0018\u0000 ;2\u00020\u0001:\u0002<;BK\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u000b\u0012\u0018\u0008\u0002\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\u0008\u0012\u0004\u0012\u00020\u000e`\u000f\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0011\u0012\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u00085\u00106Bg\u0008\u0017\u0012\u0006\u00107\u001a\u00020\u001c\u0012\n\u0008\u0001\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\u0008\u0008\u0001\u0010\u0016\u001a\u00020\u000b\u0012\u001c\u0008\u0001\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u000f\u0012\n\u0008\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0011\u0012\n\u0008\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u00109\u001a\u0004\u0018\u000108\u00a2\u0006\u0004\u00085\u0010:J!\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u000bH\u00c6\u0003J\u0019\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\u0008\u0012\u0004\u0012\u00020\u000e`\u000fH\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003JO\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0015\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u000b2\u0018\u0008\u0002\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\u0008\u0012\u0004\u0012\u00020\u000e`\u000f2\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0013H\u00c6\u0001J\t\u0010\u001b\u001a\u00020\tH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001cH\u00d6\u0001J\u0013\u0010\u001f\u001a\u00020\u000b2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R \u0010\u0015\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010 \u0012\u0004\u0008#\u0010$\u001a\u0004\u0008!\u0010\"R \u0010\u0016\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010%\u0012\u0004\u0008(\u0010$\u001a\u0004\u0008&\u0010\'R0\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\u0008\u0012\u0004\u0012\u00020\u000e`\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010)\u0012\u0004\u0008,\u0010$\u001a\u0004\u0008*\u0010+R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010-\u0012\u0004\u00080\u0010$\u001a\u0004\u0008.\u0010/R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0019\u00101\u0012\u0004\u00084\u0010$\u001a\u0004\u00082\u00103\u00a8\u0006="
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/SharedDataSpec;",
        "",
        "self",
        "LUt0;",
        "output",
        "LMs5;",
        "serialDesc",
        "",
        "write$Self",
        "",
        "component1",
        "",
        "component2",
        "Ljava/util/ArrayList;",
        "Lcom/stripe/android/ui/core/elements/FormItemSpec;",
        "Lkotlin/collections/ArrayList;",
        "component3",
        "Lcom/stripe/android/ui/core/elements/NextActionSpec;",
        "component4",
        "Lcom/stripe/android/ui/core/elements/SelectorIcon;",
        "component5",
        "type",
        "async",
        "fields",
        "nextActionSpec",
        "selectorIcon",
        "copy",
        "toString",
        "",
        "hashCode",
        "other",
        "equals",
        "Ljava/lang/String;",
        "getType",
        "()Ljava/lang/String;",
        "getType$annotations",
        "()V",
        "Z",
        "getAsync",
        "()Z",
        "getAsync$annotations",
        "Ljava/util/ArrayList;",
        "getFields",
        "()Ljava/util/ArrayList;",
        "getFields$annotations",
        "Lcom/stripe/android/ui/core/elements/NextActionSpec;",
        "getNextActionSpec",
        "()Lcom/stripe/android/ui/core/elements/NextActionSpec;",
        "getNextActionSpec$annotations",
        "Lcom/stripe/android/ui/core/elements/SelectorIcon;",
        "getSelectorIcon",
        "()Lcom/stripe/android/ui/core/elements/SelectorIcon;",
        "getSelectorIcon$annotations",
        "<init>",
        "(Ljava/lang/String;ZLjava/util/ArrayList;Lcom/stripe/android/ui/core/elements/NextActionSpec;Lcom/stripe/android/ui/core/elements/SelectorIcon;)V",
        "seen1",
        "Lbt5;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;ZLjava/util/ArrayList;Lcom/stripe/android/ui/core/elements/NextActionSpec;Lcom/stripe/android/ui/core/elements/SelectorIcon;Lbt5;)V",
        "Companion",
        "$serializer",
        "payments-ui-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/ui/core/elements/SharedDataSpec$Companion;


# instance fields
.field private final async:Z

.field private final fields:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/stripe/android/ui/core/elements/FormItemSpec;",
            ">;"
        }
    .end annotation
.end field

.field private final nextActionSpec:Lcom/stripe/android/ui/core/elements/NextActionSpec;

.field private final selectorIcon:Lcom/stripe/android/ui/core/elements/SelectorIcon;

.field private final type:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/ui/core/elements/SharedDataSpec$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/ui/core/elements/SharedDataSpec$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->Companion:Lcom/stripe/android/ui/core/elements/SharedDataSpec$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ZLjava/util/ArrayList;Lcom/stripe/android/ui/core/elements/NextActionSpec;Lcom/stripe/android/ui/core/elements/SelectorIcon;Lbt5;)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "type"
        .end annotation
    .end param
    .param p3    # Z
        .annotation runtime LVs5;
            value = "async"
        .end annotation
    .end param
    .param p4    # Ljava/util/ArrayList;
        .annotation runtime LVs5;
            value = "fields"
        .end annotation
    .end param
    .param p5    # Lcom/stripe/android/ui/core/elements/NextActionSpec;
        .annotation runtime LVs5;
            value = "next_action_spec"
        .end annotation
    .end param
    .param p6    # Lcom/stripe/android/ui/core/elements/SelectorIcon;
        .annotation runtime LVs5;
            value = "selector_icon"
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "This synthesized declaration should not be used directly"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = ""
            imports = {}
        .end subannotation
    .end annotation

    and-int/lit8 p7, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p7, :cond_0

    sget-object p7, Lcom/stripe/android/ui/core/elements/SharedDataSpec$$serializer;->INSTANCE:Lcom/stripe/android/ui/core/elements/SharedDataSpec$$serializer;

    invoke-virtual {p7}, Lcom/stripe/android/ui/core/elements/SharedDataSpec$$serializer;->getDescriptor()LMs5;

    move-result-object p7

    invoke-static {p1, v0, p7}, LzW3;->b(IILMs5;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->type:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x2

    const/4 p7, 0x0

    if-nez p2, :cond_1

    iput-boolean p7, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->async:Z

    goto :goto_0

    :cond_1
    iput-boolean p3, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->async:Z

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    new-array p2, v0, [Lcom/stripe/android/ui/core/elements/FormItemSpec;

    sget-object p3, Lcom/stripe/android/ui/core/elements/EmptyFormSpec;->INSTANCE:Lcom/stripe/android/ui/core/elements/EmptyFormSpec;

    aput-object p3, p2, p7

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->arrayListOf([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->fields:Ljava/util/ArrayList;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->fields:Ljava/util/ArrayList;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    const/4 p3, 0x0

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->nextActionSpec:Lcom/stripe/android/ui/core/elements/NextActionSpec;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->nextActionSpec:Lcom/stripe/android/ui/core/elements/NextActionSpec;

    :goto_2
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_4

    iput-object p3, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->selectorIcon:Lcom/stripe/android/ui/core/elements/SelectorIcon;

    goto :goto_3

    :cond_4
    iput-object p6, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->selectorIcon:Lcom/stripe/android/ui/core/elements/SelectorIcon;

    :goto_3
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZLjava/util/ArrayList;Lcom/stripe/android/ui/core/elements/NextActionSpec;Lcom/stripe/android/ui/core/elements/SelectorIcon;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/ArrayList<",
            "Lcom/stripe/android/ui/core/elements/FormItemSpec;",
            ">;",
            "Lcom/stripe/android/ui/core/elements/NextActionSpec;",
            "Lcom/stripe/android/ui/core/elements/SelectorIcon;",
            ")V"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fields"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->type:Ljava/lang/String;

    iput-boolean p2, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->async:Z

    iput-object p3, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->fields:Ljava/util/ArrayList;

    iput-object p4, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->nextActionSpec:Lcom/stripe/android/ui/core/elements/NextActionSpec;

    iput-object p5, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->selectorIcon:Lcom/stripe/android/ui/core/elements/SelectorIcon;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZLjava/util/ArrayList;Lcom/stripe/android/ui/core/elements/NextActionSpec;Lcom/stripe/android/ui/core/elements/SelectorIcon;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move v3, v0

    goto :goto_0

    :cond_0
    move v3, p2

    :goto_0
    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    new-array p2, p2, [Lcom/stripe/android/ui/core/elements/FormItemSpec;

    sget-object p3, Lcom/stripe/android/ui/core/elements/EmptyFormSpec;->INSTANCE:Lcom/stripe/android/ui/core/elements/EmptyFormSpec;

    aput-object p3, p2, v0

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->arrayListOf([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p3

    :cond_1
    move-object v4, p3

    and-int/lit8 p2, p6, 0x8

    const/4 p3, 0x0

    if-eqz p2, :cond_2

    move-object v5, p3

    goto :goto_1

    :cond_2
    move-object v5, p4

    :goto_1
    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_3

    move-object v6, p3

    goto :goto_2

    :cond_3
    move-object v6, p5

    :goto_2
    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;-><init>(Ljava/lang/String;ZLjava/util/ArrayList;Lcom/stripe/android/ui/core/elements/NextActionSpec;Lcom/stripe/android/ui/core/elements/SelectorIcon;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/ui/core/elements/SharedDataSpec;Ljava/lang/String;ZLjava/util/ArrayList;Lcom/stripe/android/ui/core/elements/NextActionSpec;Lcom/stripe/android/ui/core/elements/SelectorIcon;ILjava/lang/Object;)Lcom/stripe/android/ui/core/elements/SharedDataSpec;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->type:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-boolean p2, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->async:Z

    :cond_1
    move p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->fields:Ljava/util/ArrayList;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->nextActionSpec:Lcom/stripe/android/ui/core/elements/NextActionSpec;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->selectorIcon:Lcom/stripe/android/ui/core/elements/SelectorIcon;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move p4, p7

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->copy(Ljava/lang/String;ZLjava/util/ArrayList;Lcom/stripe/android/ui/core/elements/NextActionSpec;Lcom/stripe/android/ui/core/elements/SelectorIcon;)Lcom/stripe/android/ui/core/elements/SharedDataSpec;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getAsync$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "async"
    .end annotation

    return-void
.end method

.method public static synthetic getFields$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "fields"
    .end annotation

    return-void
.end method

.method public static synthetic getNextActionSpec$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "next_action_spec"
    .end annotation

    return-void
.end method

.method public static synthetic getSelectorIcon$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "selector_icon"
    .end annotation

    return-void
.end method

.method public static synthetic getType$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "type"
    .end annotation

    return-void
.end method

.method public static final write$Self(Lcom/stripe/android/ui/core/elements/SharedDataSpec;LUt0;LMs5;)V
    .locals 6
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "self"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serialDesc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->type:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1, v0}, LUt0;->w(LMs5;ILjava/lang/String;)V

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v2

    if-eqz v2, :cond_0

    :goto_0
    move v2, v0

    goto :goto_1

    :cond_0
    iget-boolean v2, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->async:Z

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_1
    if-eqz v2, :cond_2

    iget-boolean v2, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->async:Z

    invoke-interface {p1, p2, v0, v2}, LUt0;->v(LMs5;IZ)V

    :cond_2
    const/4 v2, 0x2

    invoke-interface {p1, p2, v2}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_3

    :goto_2
    move v3, v0

    goto :goto_3

    :cond_3
    iget-object v3, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->fields:Ljava/util/ArrayList;

    new-array v4, v0, [Lcom/stripe/android/ui/core/elements/FormItemSpec;

    sget-object v5, Lcom/stripe/android/ui/core/elements/EmptyFormSpec;->INSTANCE:Lcom/stripe/android/ui/core/elements/EmptyFormSpec;

    aput-object v5, v4, v1

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->arrayListOf([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_2

    :cond_4
    move v3, v1

    :goto_3
    if-eqz v3, :cond_5

    new-instance v3, Lro;

    sget-object v4, Lcom/stripe/android/ui/core/elements/FormItemSpecSerializer;->INSTANCE:Lcom/stripe/android/ui/core/elements/FormItemSpecSerializer;

    invoke-direct {v3, v4}, Lro;-><init>(LKj2;)V

    iget-object v4, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->fields:Ljava/util/ArrayList;

    invoke-interface {p1, p2, v2, v3, v4}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_5
    const/4 v2, 0x3

    invoke-interface {p1, p2, v2}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_6

    :goto_4
    move v3, v0

    goto :goto_5

    :cond_6
    iget-object v3, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->nextActionSpec:Lcom/stripe/android/ui/core/elements/NextActionSpec;

    if-eqz v3, :cond_7

    goto :goto_4

    :cond_7
    move v3, v1

    :goto_5
    if-eqz v3, :cond_8

    sget-object v3, Lcom/stripe/android/ui/core/elements/NextActionSpec$$serializer;->INSTANCE:Lcom/stripe/android/ui/core/elements/NextActionSpec$$serializer;

    iget-object v4, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->nextActionSpec:Lcom/stripe/android/ui/core/elements/NextActionSpec;

    invoke-interface {p1, p2, v2, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_8
    const/4 v2, 0x4

    invoke-interface {p1, p2, v2}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_9

    :goto_6
    move v1, v0

    goto :goto_7

    :cond_9
    iget-object v3, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->selectorIcon:Lcom/stripe/android/ui/core/elements/SelectorIcon;

    if-eqz v3, :cond_a

    goto :goto_6

    :cond_a
    :goto_7
    if-eqz v1, :cond_b

    sget-object v0, Lcom/stripe/android/ui/core/elements/SelectorIcon$$serializer;->INSTANCE:Lcom/stripe/android/ui/core/elements/SelectorIcon$$serializer;

    iget-object p0, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->selectorIcon:Lcom/stripe/android/ui/core/elements/SelectorIcon;

    invoke-interface {p1, p2, v2, v0, p0}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_b
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->async:Z

    return v0
.end method

.method public final component3()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/stripe/android/ui/core/elements/FormItemSpec;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->fields:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final component4()Lcom/stripe/android/ui/core/elements/NextActionSpec;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->nextActionSpec:Lcom/stripe/android/ui/core/elements/NextActionSpec;

    return-object v0
.end method

.method public final component5()Lcom/stripe/android/ui/core/elements/SelectorIcon;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->selectorIcon:Lcom/stripe/android/ui/core/elements/SelectorIcon;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ZLjava/util/ArrayList;Lcom/stripe/android/ui/core/elements/NextActionSpec;Lcom/stripe/android/ui/core/elements/SelectorIcon;)Lcom/stripe/android/ui/core/elements/SharedDataSpec;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/ArrayList<",
            "Lcom/stripe/android/ui/core/elements/FormItemSpec;",
            ">;",
            "Lcom/stripe/android/ui/core/elements/NextActionSpec;",
            "Lcom/stripe/android/ui/core/elements/SelectorIcon;",
            ")",
            "Lcom/stripe/android/ui/core/elements/SharedDataSpec;"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fields"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;

    move-object v1, v0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;-><init>(Ljava/lang/String;ZLjava/util/ArrayList;Lcom/stripe/android/ui/core/elements/NextActionSpec;Lcom/stripe/android/ui/core/elements/SelectorIcon;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/ui/core/elements/SharedDataSpec;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/ui/core/elements/SharedDataSpec;

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->type:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->async:Z

    iget-boolean v3, p1, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->async:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->fields:Ljava/util/ArrayList;

    iget-object v3, p1, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->fields:Ljava/util/ArrayList;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->nextActionSpec:Lcom/stripe/android/ui/core/elements/NextActionSpec;

    iget-object v3, p1, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->nextActionSpec:Lcom/stripe/android/ui/core/elements/NextActionSpec;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->selectorIcon:Lcom/stripe/android/ui/core/elements/SelectorIcon;

    iget-object p1, p1, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->selectorIcon:Lcom/stripe/android/ui/core/elements/SelectorIcon;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAsync()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->async:Z

    return v0
.end method

.method public final getFields()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/stripe/android/ui/core/elements/FormItemSpec;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->fields:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final getNextActionSpec()Lcom/stripe/android/ui/core/elements/NextActionSpec;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->nextActionSpec:Lcom/stripe/android/ui/core/elements/NextActionSpec;

    return-object v0
.end method

.method public final getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->selectorIcon:Lcom/stripe/android/ui/core/elements/SelectorIcon;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->type:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->type:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->async:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->fields:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->nextActionSpec:Lcom/stripe/android/ui/core/elements/NextActionSpec;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/NextActionSpec;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->selectorIcon:Lcom/stripe/android/ui/core/elements/SelectorIcon;

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->type:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->async:Z

    iget-object v2, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->fields:Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->nextActionSpec:Lcom/stripe/android/ui/core/elements/NextActionSpec;

    iget-object v4, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->selectorIcon:Lcom/stripe/android/ui/core/elements/SelectorIcon;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "SharedDataSpec(type="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", async="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", fields="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", nextActionSpec="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", selectorIcon="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
