.class public final synthetic LE82;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LG82;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(LG82;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE82;->b:LG82;

    iput-object p2, p0, LE82;->c:Ljava/lang/String;

    iput p3, p0, LE82;->d:I

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LE82;->b:LG82;

    iget-object v1, p0, LE82;->c:Ljava/lang/String;

    iget v2, p0, LE82;->d:I

    invoke-static {v0, v1, v2}, LG82;->m(LG82;Ljava/lang/String;I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
