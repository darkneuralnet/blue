.class public final Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKj2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LKj2<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c0\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0016R\u001a\u0010\u000c\u001a\u00020\u000b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;",
        "LKj2;",
        "",
        "Lrb1;",
        "encoder",
        "value",
        "",
        "serialize",
        "LGV0;",
        "decoder",
        "deserialize",
        "LMs5;",
        "descriptor",
        "LMs5;",
        "getDescriptor",
        "()LMs5;",
        "<init>",
        "()V",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;

.field private static final descriptor:LMs5;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;

    const-string v0, "MarkdownToHtml"

    sget-object v1, LE24$i;->a:LE24$i;

    invoke-static {v0, v1}, LQs5;->a(Ljava/lang/String;LE24;)LMs5;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;->descriptor:LMs5;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic deserialize(LGV0;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;->deserialize(LGV0;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public deserialize(LGV0;)Ljava/lang/String;
    .locals 1

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/financialconnections/features/MarkdownParser;->INSTANCE:Lcom/stripe/android/financialconnections/features/MarkdownParser;

    invoke-interface {p1}, LGV0;->t()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/stripe/android/financialconnections/features/MarkdownParser;->toHtml$financial_connections_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()LMs5;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;->descriptor:LMs5;

    return-object v0
.end method

.method public bridge synthetic serialize(Lrb1;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;->serialize(Lrb1;Ljava/lang/String;)V

    return-void
.end method

.method public serialize(Lrb1;Ljava/lang/String;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lrb1;->q(Ljava/lang/String;)V

    return-void
.end method
