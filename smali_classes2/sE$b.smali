.class public final LsE$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LsE;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LhJ3;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lxa6;


# direct methods
.method public constructor <init>(Lxa6;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LsE$b;->a:Ljava/util/List;

    iput-object p1, p0, LsE$b;->b:Lxa6;

    return-void
.end method

.method public synthetic constructor <init>(Lxa6;LsE$a;)V
    .locals 0

    invoke-direct {p0, p1}, LsE$b;-><init>(Lxa6;)V

    return-void
.end method

.method public static synthetic a(LsE$b;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LsE$b;->a:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic b(LsE$b;)Lxa6;
    .locals 0

    iget-object p0, p0, LsE$b;->b:Lxa6;

    return-object p0
.end method
