.class public final LO57;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LD57;

.field public final b:LM57;


# direct methods
.method public constructor <init>(LM57;)V
    .locals 1

    sget-object v0, LC57;->b:LC57;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO57;->b:LM57;

    iput-object v0, p0, LO57;->a:LD57;

    return-void
.end method

.method public static bridge synthetic a(LO57;)LD57;
    .locals 0

    iget-object p0, p0, LO57;->a:LD57;

    return-object p0
.end method

.method public static b(Ljava/lang/String;)LO57;
    .locals 2

    new-instance p0, LO57;

    new-instance v0, LM57;

    const-string v1, "#vk "

    invoke-direct {v0, v1}, LM57;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, LO57;-><init>(LM57;)V

    return-object p0
.end method


# virtual methods
.method public final c(Ljava/lang/CharSequence;)Ljava/util/List;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, LO57;->b:LM57;

    new-instance v1, LL57;

    invoke-direct {v1, v0, p0, p1}, LL57;-><init>(LM57;LO57;Ljava/lang/CharSequence;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
