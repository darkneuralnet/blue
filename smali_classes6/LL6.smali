.class public final LLL6;
.super LFL6;
.source "SourceFile"


# instance fields
.field public final a:LJL6;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LFL6;-><init>()V

    new-instance v0, LJL6;

    invoke-direct {v0}, LJL6;-><init>()V

    iput-object v0, p0, LLL6;->a:LJL6;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 1

    if-eq p2, p1, :cond_1

    if-eqz p2, :cond_0

    iget-object v0, p0, LLL6;->a:LJL6;

    invoke-virtual {v0, p1}, LJL6;->a(Ljava/lang/Throwable;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "The suppressed exception cannot be null."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Self suppression is not allowed."

    invoke-direct {p1, v0, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method
