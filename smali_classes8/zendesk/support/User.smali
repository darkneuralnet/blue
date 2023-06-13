.class public Lzendesk/support/User;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private agent:Z

.field private id:Ljava/lang/Long;

.field private name:Ljava/lang/String;

.field private organizationId:Ljava/lang/Long;

.field private photo:Lzendesk/support/Attachment;

.field private tags:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private userFields:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lzendesk/support/User;->id:Ljava/lang/Long;

    const-string v1, ""

    iput-object v1, p0, Lzendesk/support/User;->name:Ljava/lang/String;

    const/4 v1, 0x0

    iput-object v1, p0, Lzendesk/support/User;->photo:Lzendesk/support/Attachment;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lzendesk/support/User;->agent:Z

    iput-object v0, p0, Lzendesk/support/User;->organizationId:Ljava/lang/Long;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lzendesk/support/User;->tags:Ljava/util/List;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lzendesk/support/User;->userFields:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Long;Ljava/lang/String;Lzendesk/support/Attachment;ZLjava/lang/Long;Ljava/util/List;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Lzendesk/support/Attachment;",
            "Z",
            "Ljava/lang/Long;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/User;->id:Ljava/lang/Long;

    iput-object p2, p0, Lzendesk/support/User;->name:Ljava/lang/String;

    iput-object p3, p0, Lzendesk/support/User;->photo:Lzendesk/support/Attachment;

    iput-boolean p4, p0, Lzendesk/support/User;->agent:Z

    iput-object p5, p0, Lzendesk/support/User;->organizationId:Ljava/lang/Long;

    iput-object p6, p0, Lzendesk/support/User;->tags:Ljava/util/List;

    iput-object p7, p0, Lzendesk/support/User;->userFields:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_d

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_5

    :cond_1
    check-cast p1, Lzendesk/support/User;

    iget-boolean v2, p0, Lzendesk/support/User;->agent:Z

    iget-boolean v3, p1, Lzendesk/support/User;->agent:Z

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Lzendesk/support/User;->id:Ljava/lang/Long;

    if-eqz v2, :cond_3

    iget-object v3, p1, Lzendesk/support/User;->id:Ljava/lang/Long;

    invoke-virtual {v2, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_0

    :cond_3
    iget-object v2, p1, Lzendesk/support/User;->id:Ljava/lang/Long;

    if-eqz v2, :cond_4

    :goto_0
    return v1

    :cond_4
    iget-object v2, p0, Lzendesk/support/User;->photo:Lzendesk/support/Attachment;

    if-eqz v2, :cond_5

    iget-object v3, p1, Lzendesk/support/User;->photo:Lzendesk/support/Attachment;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_1

    :cond_5
    iget-object v2, p1, Lzendesk/support/User;->photo:Lzendesk/support/Attachment;

    if-eqz v2, :cond_6

    :goto_1
    return v1

    :cond_6
    iget-object v2, p0, Lzendesk/support/User;->organizationId:Ljava/lang/Long;

    if-eqz v2, :cond_7

    iget-object v3, p1, Lzendesk/support/User;->organizationId:Ljava/lang/Long;

    invoke-virtual {v2, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_2

    :cond_7
    iget-object v2, p1, Lzendesk/support/User;->organizationId:Ljava/lang/Long;

    if-eqz v2, :cond_8

    :goto_2
    return v1

    :cond_8
    iget-object v2, p0, Lzendesk/support/User;->tags:Ljava/util/List;

    if-eqz v2, :cond_9

    iget-object v3, p1, Lzendesk/support/User;->tags:Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    goto :goto_3

    :cond_9
    iget-object v2, p1, Lzendesk/support/User;->tags:Ljava/util/List;

    if-eqz v2, :cond_a

    :goto_3
    return v1

    :cond_a
    iget-object v2, p0, Lzendesk/support/User;->userFields:Ljava/util/Map;

    iget-object p1, p1, Lzendesk/support/User;->userFields:Ljava/util/Map;

    if-eqz v2, :cond_b

    invoke-interface {v2, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_4

    :cond_b
    if-nez p1, :cond_c

    goto :goto_4

    :cond_c
    move v0, v1

    :goto_4
    return v0

    :cond_d
    :goto_5
    return v1
.end method

.method public getId()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lzendesk/support/User;->id:Ljava/lang/Long;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzendesk/support/User;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getOrganizationId()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lzendesk/support/User;->organizationId:Ljava/lang/Long;

    return-object v0
.end method

.method public getPhoto()Lzendesk/support/Attachment;
    .locals 1

    iget-object v0, p0, Lzendesk/support/User;->photo:Lzendesk/support/Attachment;

    return-object v0
.end method

.method public getTags()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/support/User;->tags:Ljava/util/List;

    invoke-static {v0}, Ljm0;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getUserFields()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/support/User;->userFields:Ljava/util/Map;

    invoke-static {v0}, Ljm0;->d(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lzendesk/support/User;->id:Ljava/lang/Long;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lzendesk/support/User;->photo:Lzendesk/support/Attachment;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lzendesk/support/User;->agent:Z

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lzendesk/support/User;->organizationId:Ljava/lang/Long;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Long;->hashCode()I

    move-result v2

    goto :goto_2

    :cond_2
    move v2, v1

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lzendesk/support/User;->tags:Ljava/util/List;

    if-eqz v2, :cond_3

    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    goto :goto_3

    :cond_3
    move v2, v1

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lzendesk/support/User;->userFields:Ljava/util/Map;

    if-eqz v2, :cond_4

    invoke-interface {v2}, Ljava/util/Map;->hashCode()I

    move-result v1

    :cond_4
    add-int/2addr v0, v1

    return v0
.end method

.method public isAgent()Z
    .locals 1

    iget-boolean v0, p0, Lzendesk/support/User;->agent:Z

    return v0
.end method
