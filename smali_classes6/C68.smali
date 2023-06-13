.class public final LC68;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/Set;

.field public final b:Lba$b;

.field public final c:Lgj;

.field public final d:LtY7;


# direct methods
.method public constructor <init>(Lgj;Lba$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LC68;->b:Lba$b;

    iput-object p1, p0, LC68;->c:Lgj;

    new-instance p2, LtY7;

    invoke-direct {p2, p0}, LtY7;-><init>(LC68;)V

    iput-object p2, p0, LC68;->d:LtY7;

    invoke-virtual {p1, p2}, Lgj;->f(Lgj$a;)V

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, LC68;->a:Ljava/util/Set;

    return-void
.end method

.method public static bridge synthetic a(LC68;)Lba$b;
    .locals 0

    iget-object p0, p0, LC68;->b:Lba$b;

    return-object p0
.end method
