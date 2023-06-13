.class public final LVi2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKj2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LVi2$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LKj2<",
        "LSi2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c1\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0016R\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0012"
    }
    d2 = {
        "LVi2;",
        "LKj2;",
        "LSi2;",
        "Lrb1;",
        "encoder",
        "value",
        "",
        "b",
        "LGV0;",
        "decoder",
        "a",
        "LMs5;",
        "LMs5;",
        "getDescriptor",
        "()LMs5;",
        "descriptor",
        "<init>",
        "()V",
        "kotlinx-serialization-json"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/PublishedApi;
.end annotation


# static fields
.field public static final a:LVi2;

.field public static final b:LMs5;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LVi2;

    invoke-direct {v0}, LVi2;-><init>()V

    sput-object v0, LVi2;->a:LVi2;

    sget-object v0, LVi2$a;->b:LVi2$a;

    sput-object v0, LVi2;->b:LMs5;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LGV0;)LSi2;
    .locals 3

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LCi2;->b(LGV0;)V

    new-instance v0, LSi2;

    sget-object v1, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-static {v1}, Lb40;->D(Lkotlin/jvm/internal/StringCompanionObject;)LKj2;

    move-result-object v1

    sget-object v2, LBi2;->a:LBi2;

    invoke-static {v1, v2}, Lb40;->i(LKj2;LKj2;)LKj2;

    move-result-object v1

    invoke-interface {v1, p1}, LE01;->deserialize(LGV0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {v0, p1}, LSi2;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method public b(Lrb1;LSi2;)V
    .locals 2

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LCi2;->c(Lrb1;)V

    sget-object v0, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-static {v0}, Lb40;->D(Lkotlin/jvm/internal/StringCompanionObject;)LKj2;

    move-result-object v0

    sget-object v1, LBi2;->a:LBi2;

    invoke-static {v0, v1}, Lb40;->i(LKj2;LKj2;)LKj2;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Let5;->serialize(Lrb1;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic deserialize(LGV0;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LVi2;->a(LGV0;)LSi2;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()LMs5;
    .locals 1

    sget-object v0, LVi2;->b:LMs5;

    return-object v0
.end method

.method public bridge synthetic serialize(Lrb1;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LSi2;

    invoke-virtual {p0, p1, p2}, LVi2;->b(Lrb1;LSi2;)V

    return-void
.end method
