.class public final synthetic Lwo7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LAo7;

.field public final synthetic c:Lso7;

.field public final synthetic d:LWk7;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LAo7;Lso7;LWk7;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwo7;->b:LAo7;

    iput-object p2, p0, Lwo7;->c:Lso7;

    iput-object p3, p0, Lwo7;->d:LWk7;

    iput-object p4, p0, Lwo7;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lwo7;->b:LAo7;

    iget-object v1, p0, Lwo7;->c:Lso7;

    iget-object v2, p0, Lwo7;->d:LWk7;

    iget-object v3, p0, Lwo7;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, LAo7;->a(Lso7;LWk7;Ljava/lang/String;)V

    return-void
.end method
