.class public Lbo/app/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LkO1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbo/app/g1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LkO1<",
        "Lcom/appboy/events/FeedUpdatedEvent;",
        ">;"
    }
.end annotation


# static fields
.field private static final f:Ljava/lang/String;


# instance fields
.field private final a:Landroid/content/SharedPreferences;

.field private final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lbo/app/a2;

.field private final e:Lbo/app/y1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lbo/app/g1;

    invoke-static {v0}, Lk20;->n(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lbo/app/g1;->f:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lbo/app/y1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lbo/app/f1;

    invoke-direct {v0}, Lbo/app/f1;-><init>()V

    iput-object v0, p0, Lbo/app/g1;->d:Lbo/app/a2;

    if-nez p2, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    invoke-static {p1, v0}, LjS5;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object p3, p0, Lbo/app/g1;->e:Lbo/app/y1;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "com.appboy.storage.feedstorageprovider"

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const/4 v0, 0x0

    invoke-virtual {p1, p3, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lbo/app/g1;->a:Landroid/content/SharedPreferences;

    sget-object p1, Lbo/app/g1$a;->e:Lbo/app/g1$a;

    invoke-direct {p0, p1}, Lbo/app/g1;->a(Lbo/app/g1$a;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lbo/app/g1;->b:Ljava/util/Set;

    sget-object p1, Lbo/app/g1$a;->d:Lbo/app/g1$a;

    invoke-direct {p0, p1}, Lbo/app/g1;->a(Lbo/app/g1$a;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lbo/app/g1;->c:Ljava/util/Set;

    invoke-direct {p0, p2}, Lbo/app/g1;->a(Ljava/lang/String;)V

    return-void
.end method

.method private a(Lorg/json/JSONArray;Ljava/lang/String;ZJ)Lcom/appboy/events/FeedUpdatedEvent;
    .locals 6

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/appboy/enums/CardKey$Provider;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/appboy/enums/CardKey$Provider;-><init>(Z)V

    iget-object v1, p0, Lbo/app/g1;->e:Lbo/app/y1;

    iget-object v2, p0, Lbo/app/g1;->d:Lbo/app/a2;

    invoke-static {p1, v0, v1, p0, v2}, Lbo/app/u;->a(Lorg/json/JSONArray;Lcom/appboy/enums/CardKey$Provider;Lbo/app/y1;LkO1;Lbo/app/a2;)Ljava/util/List;

    move-result-object p1

    goto :goto_1

    :cond_1
    :goto_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    move-object v1, p1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/appboy/models/cards/Card;

    iget-object v2, p0, Lbo/app/g1;->b:Ljava/util/Set;

    invoke-virtual {v0}, Lcom/appboy/models/cards/Card;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    invoke-virtual {v0, v3}, Lcom/appboy/models/cards/Card;->setViewed(Z)V

    invoke-virtual {v0, v3}, Lcom/appboy/models/cards/Card;->setIndicatorHighlighted(Z)V

    :cond_3
    iget-object v2, p0, Lbo/app/g1;->c:Ljava/util/Set;

    invoke-virtual {v0}, Lcom/appboy/models/cards/Card;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0, v3}, Lcom/appboy/models/cards/Card;->setIndicatorHighlighted(Z)V

    goto :goto_2

    :cond_4
    new-instance p1, Lcom/appboy/events/FeedUpdatedEvent;

    move-object v0, p1

    move-object v2, p2

    move v3, p3

    move-wide v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/appboy/events/FeedUpdatedEvent;-><init>(Ljava/util/List;Ljava/lang/String;ZJ)V

    return-object p1
.end method

.method private a(Lbo/app/g1$a;)Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbo/app/g1$a;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lbo/app/g1$a;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lbo/app/g1;->a:Landroid/content/SharedPreferences;

    invoke-interface {v1, v0}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lbo/app/g1;->a:Landroid/content/SharedPreferences;

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lbo/app/g1;->b(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v1

    iget-object v2, p0, Lbo/app/g1;->a:Landroid/content/SharedPreferences;

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-virtual {p0, v1, p1}, Lbo/app/g1;->a(Ljava/util/Set;Lbo/app/g1$a;)V

    return-object v1

    :cond_0
    invoke-virtual {p1}, Lbo/app/g1$a;->b()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lbo/app/g1;->a:Landroid/content/SharedPreferences;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    new-instance v0, Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-direct {v0, p1}, Ljava/util/concurrent/ConcurrentSkipListSet;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public static a(Lorg/json/JSONArray;)Ljava/util/Set;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    if-eqz p0, :cond_1

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    sget-object v3, Lcom/appboy/enums/CardKey;->ID:Lcom/appboy/enums/CardKey;

    invoke-virtual {v3}, Lcom/appboy/enums/CardKey;->getFeedKey()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Lcom/appboy/enums/CardKey;->getFeedKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lbo/app/g1;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "uid"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method private a(Lorg/json/JSONArray;J)V
    .locals 3

    iget-object v0, p0, Lbo/app/g1;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "cards"

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto :goto_1

    :cond_1
    :goto_0
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    :goto_1
    const-string p1, "cards_timestamp"

    invoke-interface {v0, p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public static b(Ljava/lang/String;)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    if-eqz p0, :cond_0

    const-string v1, ";"

    invoke-virtual {p0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    :cond_0
    return-object v0
.end method


# virtual methods
.method public a()Lcom/appboy/events/FeedUpdatedEvent;
    .locals 9

    iget-object v0, p0, Lbo/app/g1;->a:Landroid/content/SharedPreferences;

    const-string v1, "uid"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, Lbo/app/g1;->a:Landroid/content/SharedPreferences;

    const-string v1, "cards"

    const-string v2, "[]"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lbo/app/g1;->a:Landroid/content/SharedPreferences;

    const-string v1, "cards_timestamp"

    const-wide/16 v2, -0x1

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v7

    const/4 v6, 0x1

    move-object v3, p0

    invoke-direct/range {v3 .. v8}, Lbo/app/g1;->a(Lorg/json/JSONArray;Ljava/lang/String;ZJ)Lcom/appboy/events/FeedUpdatedEvent;

    move-result-object v0

    return-object v0
.end method

.method public a(Lorg/json/JSONArray;Ljava/lang/String;)Lcom/appboy/events/FeedUpdatedEvent;
    .locals 8

    const-string v0, ""

    if-nez p2, :cond_0

    move-object v1, v0

    goto :goto_0

    :cond_0
    move-object v1, p2

    :goto_0
    iget-object v2, p0, Lbo/app/g1;->a:Landroid/content/SharedPreferences;

    const-string v3, "uid"

    invoke-interface {v2, v3, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v0, Lbo/app/g1;->f:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Updating offline feed for user with id: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lk20;->p(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, LoT0;->i()J

    move-result-wide v6

    invoke-direct {p0, p1, v6, v7}, Lbo/app/g1;->a(Lorg/json/JSONArray;J)V

    iget-object v0, p0, Lbo/app/g1;->b:Ljava/util/Set;

    invoke-static {p1}, Lbo/app/g1;->a(Lorg/json/JSONArray;)Ljava/util/Set;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Lbo/app/g1;->b:Ljava/util/Set;

    sget-object v1, Lbo/app/g1$a;->e:Lbo/app/g1$a;

    invoke-virtual {p0, v0, v1}, Lbo/app/g1;->a(Ljava/util/Set;Lbo/app/g1$a;)V

    iget-object v0, p0, Lbo/app/g1;->c:Ljava/util/Set;

    invoke-static {p1}, Lbo/app/g1;->a(Lorg/json/JSONArray;)Ljava/util/Set;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Lbo/app/g1;->c:Ljava/util/Set;

    sget-object v1, Lbo/app/g1$a;->d:Lbo/app/g1$a;

    invoke-virtual {p0, v0, v1}, Lbo/app/g1;->a(Ljava/util/Set;Lbo/app/g1$a;)V

    const/4 v5, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v2 .. v7}, Lbo/app/g1;->a(Lorg/json/JSONArray;Ljava/lang/String;ZJ)Lcom/appboy/events/FeedUpdatedEvent;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object p1, Lbo/app/g1;->f:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The received cards are for user "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " and the current user is "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " , the cards will be discarded and no changes will be made."

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lk20;->p(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public a(Ljava/util/Set;Lbo/app/g1$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lbo/app/g1$a;",
            ")V"
        }
    .end annotation

    invoke-virtual {p2}, Lbo/app/g1$a;->b()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lbo/app/g1;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0, p2, p1}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    goto :goto_1

    :cond_1
    :goto_0
    invoke-interface {v0, p2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    :goto_1
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public markCardAsClicked(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public markCardAsDismissed(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public markCardAsViewed(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lbo/app/g1;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lbo/app/g1;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lbo/app/g1;->b:Ljava/util/Set;

    sget-object v0, Lbo/app/g1$a;->e:Lbo/app/g1$a;

    invoke-virtual {p0, p1, v0}, Lbo/app/g1;->a(Ljava/util/Set;Lbo/app/g1$a;)V

    return-void
.end method

.method public markCardAsVisuallyRead(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lbo/app/g1;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lbo/app/g1;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lbo/app/g1;->c:Ljava/util/Set;

    sget-object v0, Lbo/app/g1$a;->d:Lbo/app/g1$a;

    invoke-virtual {p0, p1, v0}, Lbo/app/g1;->a(Ljava/util/Set;Lbo/app/g1$a;)V

    return-void
.end method
