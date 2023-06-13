.class public final Lwm8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lba$b;

.field public final b:Lgj;

.field public final c:LIe8;


# direct methods
.method public constructor <init>(Lgj;Lba$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lwm8;->a:Lba$b;

    iput-object p1, p0, Lwm8;->b:Lgj;

    new-instance p2, LIe8;

    invoke-direct {p2, p0}, LIe8;-><init>(Lwm8;)V

    iput-object p2, p0, Lwm8;->c:LIe8;

    invoke-virtual {p1, p2}, Lgj;->f(Lgj$a;)V

    return-void
.end method

.method public static bridge synthetic a(Lwm8;)Lba$b;
    .locals 0

    iget-object p0, p0, Lwm8;->a:Lba$b;

    return-object p0
.end method
