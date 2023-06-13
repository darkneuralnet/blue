.class public final Ll46;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll46$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrj1<",
        "Lbl0;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ll46;
    .locals 1

    invoke-static {}, Ll46$a;->a()Ll46;

    move-result-object v0

    return-object v0
.end method

.method public static c()Lbl0;
    .locals 2

    invoke-static {}, Lj46;->b()Lbl0;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {v0, v1}, LCZ3;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbl0;

    return-object v0
.end method


# virtual methods
.method public b()Lbl0;
    .locals 1

    invoke-static {}, Ll46;->c()Lbl0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ll46;->b()Lbl0;

    move-result-object v0

    return-object v0
.end method
