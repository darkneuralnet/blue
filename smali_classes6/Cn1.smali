.class public final LCn1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LAm1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LAn1;


# direct methods
.method public constructor <init>(LAn1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCn1;->a:LAn1;

    return-void
.end method

.method public static a(LAn1;)LCn1;
    .locals 1

    new-instance v0, LCn1;

    invoke-direct {v0, p0}, LCn1;-><init>(LAn1;)V

    return-object v0
.end method

.method public static c(LAn1;)LAm1;
    .locals 1

    invoke-virtual {p0}, LAn1;->b()LAm1;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, v0}, LxZ3;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LAm1;

    return-object p0
.end method


# virtual methods
.method public b()LAm1;
    .locals 1

    iget-object v0, p0, LCn1;->a:LAn1;

    invoke-static {v0}, LCn1;->c(LAn1;)LAm1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LCn1;->b()LAm1;

    move-result-object v0

    return-object v0
.end method
