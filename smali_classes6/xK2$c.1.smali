.class public abstract LxK2$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LxK2$i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LxK2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        "E::",
        "LxK2$i<",
        "TK;TV;TE;>;>",
        "Ljava/lang/Object;",
        "LxK2$i<",
        "TK;TV;TE;>;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field

.field public final b:I

.field public final c:LxK2$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TE;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;ILxK2$i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;ITE;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LxK2$c;->a:Ljava/lang/Object;

    iput p2, p0, LxK2$c;->b:I

    iput-object p3, p0, LxK2$c;->c:LxK2$i;

    return-void
.end method


# virtual methods
.method public a()LxK2$i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    iget-object v0, p0, LxK2$c;->c:LxK2$i;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, LxK2$c;->b:I

    return v0
.end method

.method public getKey()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    iget-object v0, p0, LxK2$c;->a:Ljava/lang/Object;

    return-object v0
.end method
