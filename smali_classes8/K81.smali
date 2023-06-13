.class public LK81;
.super Lv1;
.source "SourceFile"


# static fields
.field public static final b:LK81;


# instance fields
.field public final transient a:LxX5;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LK81;

    invoke-direct {v0}, LK81;-><init>()V

    sput-object v0, LK81;->b:LK81;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const-string v0, "tech.units.indriya.format.messages"

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {v0, v1}, Ljava/util/ResourceBundle;->getBundle(Ljava/lang/String;Ljava/util/Locale;)Ljava/util/ResourceBundle;

    move-result-object v0

    invoke-static {v0}, LxX5;->g(Ljava/util/ResourceBundle;)LxX5;

    move-result-object v0

    invoke-direct {p0, v0}, LK81;-><init>(LxX5;)V

    return-void
.end method

.method public constructor <init>(LxX5;)V
    .locals 0

    invoke-direct {p0}, Lv1;-><init>()V

    iput-object p1, p0, LK81;->a:LxX5;

    return-void
.end method

.method public static d()LK81;
    .locals 1

    sget-object v0, LK81;->b:LK81;

    return-object v0
.end method


# virtual methods
.method public a(LSd6;Ljava/lang/Appendable;)Ljava/lang/Appendable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSd6<",
            "*>;",
            "Ljava/lang/Appendable;",
            ")",
            "Ljava/lang/Appendable;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LK81;->a:LxX5;

    invoke-static {p1, p2, v0}, LJ81;->b(LSd6;Ljava/lang/Appendable;LxX5;)I

    instance-of v0, p1, LFf;

    if-eqz v0, :cond_0

    check-cast p1, LFf;

    invoke-virtual {p1}, LFf;->M()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const/16 v0, 0x7b

    invoke-interface {p2, v0}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    invoke-virtual {p1}, LFf;->M()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    const/16 p1, 0x7d

    invoke-interface {p2, p1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_0
    return-object p2
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
