.class public final LZ55;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY55;


# instance fields
.field public final a:La65;


# direct methods
.method public constructor <init>(La65;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ55;->a:La65;

    return-void
.end method

.method public static b(La65;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La65;",
            ")",
            "LY94<",
            "LY55;",
            ">;"
        }
    .end annotation

    new-instance v0, LZ55;

    invoke-direct {v0, p0}, LZ55;-><init>(La65;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lb65;)LX55;
    .locals 1

    iget-object v0, p0, LZ55;->a:La65;

    invoke-virtual {v0, p1}, La65;->b(Lb65;)LX55;

    move-result-object p1

    return-object p1
.end method
